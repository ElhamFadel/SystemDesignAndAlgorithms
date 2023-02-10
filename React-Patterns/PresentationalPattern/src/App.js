import {useState} from 'react';

function useCounter({initialCount = 0,step = 1}){
   const [count,setCount] = useState(initialCount);
   const increment = () => setCount(count => count + step);
   return [count, increment]
}

function CounterContainer({initialCount,step}) {
  const [count,increment] = useCounter({initialCount,step});
  return <button onClick={increment}>{count}</button>

}

function App() {
  return (
    <div className="App">
      <CounterContainer />
    </div>
  );
}

export default App;
