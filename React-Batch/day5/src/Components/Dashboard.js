import React from "react";
import {Container, Grid} from "@material-ui/core";
import TodoItem from "./TodoItem";
import {useSelector} from "react-redux";


export default function Dashboard(){
    const todoItems = useSelector(state => state.todoList)
    return(
        <Container maxWidth="md">
            <Grid
                container
                direction="column"
                justify="center"
                alignItems="center"
            >
                {todoItems.map(todo => <TodoItem description={todo.description}
                                                 todoId={todo.id}
                                                 date={todo.date}
                                                 labels={todo.labels}/>)}

            </Grid>
        </Container>
    )
}