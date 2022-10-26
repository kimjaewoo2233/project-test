import React, {useEffect, useState} from 'react';
import axios from 'axios';


const App = () => {
  const [test, setTest] = useState("");

  useEffect(() => {
    axios.get("api/test")
    .then(response => setTest(response.data))
    .catch(err => console.log(err))
  },[]);
  
  return (
    <h1>Test Data!! : {test}</h1>
  )
}
export default App;
