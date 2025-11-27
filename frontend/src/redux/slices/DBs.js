import { createSlice } from "@reduxjs/toolkit";

const DBsSlice = createSlice({
    name: "dbtype",
    initialState: {
        typeDB: localStorage['DBtype'] === "" ? "none" : localStorage['DBtype']
    },
    reducers: {
        setTypeDBs: (_, action) => {
            localStorage['DBtype'] = action.payload.typeDB
            return action.payload
        }
    }
});

export const selectTypeDB = (state) => state.DB.typeDB
export const {setTypeDBs} = DBsSlice.actions
export const DBsReducer = DBsSlice.reducer