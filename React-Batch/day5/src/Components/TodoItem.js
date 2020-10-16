import React from "react";
import {Alert} from "@material-ui/lab";
import { makeStyles } from '@material-ui/core/styles';
import Chip from "@material-ui/core/Chip";
import {ThumbsUpDown}  from "@material-ui/icons"
import {useDispatch} from "react-redux";
import {DeleteTodo} from "../redux/ActionCreators";

const useStyles = makeStyles((theme) => ({
    root: {
        flexGrow: 1,
    },
    paper: {
        padding: theme.spacing(3),
        textAlign: 'center',
        color: theme.palette.text.secondary,
    },
}));

function LabelComponent({ labelName }){
    return(
        <Chip
            icon={<ThumbsUpDown/>}
            label={labelName}
            color="secondary"
        />
    )
}

export default function TodoItem({ todoId, description, date, labels }){
    const classes = useStyles();
    const dispatch = useDispatch()
    return(
        <Alert variant="filled" severity="success"
               style={{width: "100%", marginTop: "10px", marginBottom: "10px"}}
               aria-colspan={"12"}
               onClose={() => {
                   dispatch(DeleteTodo(todoId))
               }}>
            {`${description}. Added on: ${date}.`}
            {labels.map(label => <LabelComponent labelName={label}/>)}

        </Alert>
    )
}