import React from "react"

export default function AboutYou({ match }){
    console.log(match.params.id)
    return(
        <h1> Hello {match.params.id} </h1>
    );
}