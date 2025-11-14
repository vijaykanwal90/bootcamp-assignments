import React,{useState} from 'react'

const Counter = () => {
  const [count, setCount] = useState(0)
  const incrementCounter = ()=>{
      setCount(count+1)
  }
  const decrementCounter = ()=>{
      if(count==0){
        return
      }
      setCount(count-1)
  }
  return (
    <div>
      <h2>Counter</h2>
        <p>{count}</p>
        <button onClick={incrementCounter}> + Increase</button>
        <button onClick={decrementCounter}> - Decrease</button>

    </div>
  )
}

export default Counter