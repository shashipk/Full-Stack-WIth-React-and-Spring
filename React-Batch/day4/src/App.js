import  React from "react";
import "./App.css"
import {HashRouter as Router, Route, Switch} from "react-router-dom";
import NavigationBar from "./Components/NavigationBar";
import HomePage from "./Components/HomePage";
import AboutPage from "./Components/AboutPage";
import ContactUs from "./Components/ContactUs";
import AboutYou from "./Components/AboutYou";
import Users from "./Components/Users";
import "@babel/polyfill";
/*
* github.com/abc -> BrowserRouter
* github.com/#/abc -> HashRouter
* */
export default function App(){
    return(
        <div className="wrapper">
            <Router>
                <NavigationBar/>
                <Switch>
                    <Route exact path="/" component={HomePage}/>
                    <Route path="/about" component={AboutPage} />
                    <Route path="/contact" component={ContactUs} />
                    <Route exact path="/users" component={Users} />
                    <Route path="/users/:id" component={AboutYou} />
                </Switch>
            </Router>
        </div>
    )
}