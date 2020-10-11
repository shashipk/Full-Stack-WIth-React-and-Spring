import React, {useState} from 'react';
import {Button, Container} from "@material-ui/core";
import FormControl from '@material-ui/core/FormControl';
import InputLabel from "@material-ui/core/InputLabel";
import Input from "@material-ui/core/Input";
import FormHelperText from "@material-ui/core/FormHelperText";
import {useDispatch} from "react-redux";
import {AddTodo} from "../redux/ActionCreators";
import uuid from "react-uuid"

export default function AddTodoForm() {
    const [description, setDescription] = useState('')
    const [date, setDate] = useState('')
    const [labels, setLabels] = useState('')
    const dispatch = useDispatch()

    return(
        <Container maxWidth="md">
            <FormControl>
                <InputLabel htmlFor="my-input"> Description </InputLabel>
                <Input id="my-input" aria-describedby="my-helper-text" onChange={event => {
                    setDescription(event.target.value)
                }}/>
                <FormHelperText id="my-helper-text">Enter description of todo</FormHelperText>

                <InputLabel htmlFor="my-input1"> Date</InputLabel>
                <Input id="my-input1" aria-describedby="my-helper-text1" onChange={event => {
                    setDate(event.target.value)
                }}/>
                <FormHelperText id="my-helper-text1">Enter date of todo</FormHelperText>

                <InputLabel htmlFor="my-input2"> Labels </InputLabel>
                <Input id="my-input2" aria-describedby="my-helper-text2" onChange={event => {
                    setLabels(event.target.value)
                }}/>
                <FormHelperText id="my-helper-text2">Enter comma seperated labels</FormHelperText>

                <Button onClick={() => {
                    const labelsData = labels.split(",")
                    dispatch(AddTodo({
                        id:  uuid(),
                        description: description,
                        date: date,
                        labels: labelsData
                    }))
                }}>
                    Add Todo
                </Button>
            </FormControl>
        </Container>
    )
}