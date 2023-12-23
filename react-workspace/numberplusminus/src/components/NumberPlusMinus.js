import React, {useState} from 'react';

function NumberPlusMinus(){

  const [count, setCount] = useState(0);


  const clickHandler = () =>{
    setCount( () => count -1 );

  }

 
  return(
    <>
      
      
      
    <button onClick={clickHandler}>-</button>
    {count}
    <button onClick={() => setCount(count + 1)}>+</button>
    </>
  )

  

}



export default NumberPlusMinus;