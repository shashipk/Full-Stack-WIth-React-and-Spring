import React, {useEffect, useState} from "react";
import {Link} from "react-router-dom";

export default function Users(){
    const [users, setUsers] = useState([]);
    useEffect(function(){
        async function fetchUsers(){
            try{
                const response = await fetch("https://api.github.com/users")
                const data = await response.json()
                setUsers(data.map(userDetails => userDetails.login))
            }catch (e){
                console.log(e)
            }

        }
        fetchUsers()
    }, [])

    return(
      <div style={{display: "flex", flexDirection: "column"}}>
          <h1> Hello from users </h1>
          <ul>
              {users.map(user => <li><Link to={`/users/${user}`}> {user} </Link></li>)}
          </ul>

      </div>
    );
}