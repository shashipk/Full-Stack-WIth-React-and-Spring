import React from 'react';
import {Provider} from "react-redux";
import {store} from "./redux/store";
import './App.css';
import NavigationBar from "./Components/NavigationBar";
import {Container} from "@material-ui/core";
import Dashboard from "./Components/Dashboard";
import AddTodoForm from "./Components/AddTodoForm";

function App() {
  return (
    <Provider store={store}>
        <Container maxWidth="xl">
            <NavigationBar/>
            <Dashboard/>
            <AddTodoForm />
        </Container>
    </Provider>
  );
}

export default App;
