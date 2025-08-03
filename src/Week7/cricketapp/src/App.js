import React, { useState } from 'react';
import './App.css';
import ListofPlayers from './ListofPlayers';
import IndianPlayers from './IndianPlayers';

function App() {
  // useState to manage the flag
  const [flag, setFlag] = useState(true);

  // Function to toggle the flag
  const toggleComponent = () => {
    setFlag(prev => !prev);
  };

  return (
    <div className="App">
      <h1>🏏 Cricket App</h1>

      {/* Toggle Button */}
      <button onClick={toggleComponent}>
        Show {flag ? "IndianPlayers" : "ListofPlayers"}
      </button>

      {/* Conditional Rendering */}
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
