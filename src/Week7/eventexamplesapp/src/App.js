import React, { useState } from 'react';
import './App.css';

function App() {
  const [counter, setCounter] = useState(0);
  const [inr, setInr] = useState('');
  const [euro, setEuro] = useState(null);


  const handleIncrement = () => {
    setCounter(counter + 1);
  };


  const handleDecrement = () => {
    setCounter(counter - 1);
  };


  const sayWelcome = (message) => {
    alert(message);
  };


  const handleClick = () => {
    alert("Button clicked!");
  };


  const handleSubmit = (e) => {
    e.preventDefault();
    const conversionRate = 0.011; // 1 INR = 0.011 EUR (example rate)
    const converted = (parseFloat(inr) * conversionRate).toFixed(2);
    setEuro(converted);
  };

  return (
    <div style={{ padding: '30px', fontFamily: 'Arial', textAlign: 'center' }}>
      <h1>React Events & Currency Convertor</h1>

      <h2>Counter: {counter}</h2>
      <button onClick={handleIncrement}>Increment</button>&nbsp;
      <button onClick={handleDecrement}>Decrement</button>

      <br /><br />

      <button onClick={() => sayWelcome("Welcome!")}>Say Welcome</button>&nbsp;
      <button onClick={handleClick}>Click on me</button>

      <br /><br />

      <h2 id='currency'>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <label>
          Amount (INR): &nbsp;
          <input
            type="number"
            value={inr}
            onChange={(e) => setInr(e.target.value)}
            placeholder="Enter amount in INR"
            required
          />
        </label>

        <br /><br />

        <button type="submit">Convert</button>
      </form>

      {euro !== null && (
        <h3>Converted Amount in Euro: €{euro}</h3>
      )}
    </div>
  );
}

export default App;
