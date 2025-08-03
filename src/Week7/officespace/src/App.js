import React from 'react';
import './App.css'; 
import image from './assets/images.jpeg';

function App() {
  const element = "Office Space";
  const jsxatt = (
    <img
      src={image}
      width="25%"
      height="25%"
      alt="Office Space"
    />
  );

  const ItemName = { Name: "DBS", Rent: 50000, Address: "Chennai" };


  const colors = [];
  if (ItemName.Rent <= 60000) {
    colors.push('textRed');
  } else {
    colors.push('textGreen');
  }

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h1>{element}, at Affordable Range</h1>

      {jsxatt}

      <h1>Name: {ItemName.Name}</h1>
      <h3 className={colors[0]}>Rent: Rs. {ItemName.Rent}</h3>
      <h3>Address: {ItemName.Address}</h3>
    </div>
  );
}

export default App;
