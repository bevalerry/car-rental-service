package ru.nikitina.automobility.AutoMobility.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.nikitina.automobility.AutoMobility.security.AuthenticationRequest;
import ru.nikitina.automobility.AutoMobility.security.AuthenticationResponse;
import ru.nikitina.automobility.AutoMobility.security.AuthenticationService;
import ru.nikitina.automobility.AutoMobility.security.RegisterRequest;

@RestController
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;

    /**
     * POST - "/register"
     * Регистрация
     *
     * @param request - json запрос вида {
     *                "name": "name",
     *                "email": "email",
     *                "tel": "tel",
     *                "password": "pass",
     *                "birthDate": "2003-02-31"
     *                }
     * @return JWT-token вида {
     * "token": токен
     * }
     */

    @PostMapping("/register")
    public AuthenticationResponse register(@RequestBody RegisterRequest request) {
        return service.register(request);
    }

    /**
     * POST - "/authenticate"
     * Аутентификация
     *
     * @param request - json запрос вида {
     *                "email": email,
     *                "password" password
     *                }
     * @return JWT-token вида {
     * "token": токен
     * }
     */

    @PostMapping("/authenticate")
    public AuthenticationResponse authenticate(@RequestBody AuthenticationRequest request) {
        return service.authenticate(request);
    }


}
