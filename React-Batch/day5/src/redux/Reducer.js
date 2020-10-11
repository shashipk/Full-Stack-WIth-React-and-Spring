import {ADD_TODO, DELETE_TODO} from "./ActionTypes";

const initialState = {
    todoList: [{
        id: "todo001",
        description: "Complete the assignments",
        date: "10/10/2020",
        labels: ["important", "school"]
    }, {
        id: "todo002",
        description: "Practice React",
        date: "11/10/2020",
        labels: ["React JS Batch", "Medium"]
    }]
}

export default function rootReducer(state=initialState, action){
    switch (action.type){
        case ADD_TODO:
            return {
                ...state,
                todoList: [...state.todoList, action.payload]
            }
        case DELETE_TODO:
            return {
                ...state,
                todoList: state.todoList.filter(todo => todo.id !== action.payload)
            }
        default:
            return state
    }
}