# Dockerfile для фронтенда
FROM node:14 AS build

WORKDIR /app
COPY ./package.json ./package-lock.json ./
RUN npm install

COPY ./ ./
RUN npm run build

# Используем NGINX для раздачи статических файлов
FROM nginx:alpine
COPY --from=build /app/build /usr/share/nginx/html

COPY ./nginx/nginx.conf /etc/nginx/conf.d/default.conf