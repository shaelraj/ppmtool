import {combineReducers} from "redux";
import errorReducr from "./errorReducer";
import projectReducer from "./projectReducer";

export default combineReducers({
    errors:errorReducr,
    project: projectReducer
});