import React, { useState } from 'react';


function GuestPage() {
  return (
    <div>
      <h2>Please sign up</h2>
    </div>
    
  );
}


function UserPage() {
  return (
    <div>
      <h2>Welcome back</h2>
      
    </div>
    
  );
}


function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  
  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  
  let content;
  if (isLoggedIn) {
    content = <UserPage />;
  } else {
    content = <GuestPage />;
  }

  return (
    <div style={{ padding: '30px', fontFamily: 'Arial', textAlign: 'center' }}>
      {content}
      
      {isLoggedIn ? (
        <button onClick={handleLogout}>Logout</button>
      ) : (
        <button onClick={handleLogin}>Login</button>
      )}

      <br /><br />

     
      
    </div>
  );
}

export default App;
