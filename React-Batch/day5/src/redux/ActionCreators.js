import {ADD_TODO, DELETE_TODO} from "./ActionTypes";

export function AddTodo(todoItem){
    return {
        type: ADD_TODO,
        payload: todoItem
    }
}

export function DeleteTodo(todoId){
    return {
        type: DELETE_TODO,
        payload: todoId
    }

}