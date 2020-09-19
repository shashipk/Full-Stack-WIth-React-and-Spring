import React from 'react';
import './App.css';

function getMyName(){
  return "ABCD";
}

function displayName(number){
  if(number%2 === 0)
    return(
        <h1> My name is {getMyName()} </h1>
    );
  return (<h1>We cant print</h1>);

}

function App() {
  return (
    <div className="App">
      {displayName(2)}
    </div>
  );
}

export default App;
