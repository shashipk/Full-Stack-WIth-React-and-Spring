import {createStore} from "redux";
import rootReducer from "./Reducer";

export const store = createStore(rootReducer)