import React from 'react';

const IndianPlayers = () => {
  const team = ['Virat', 'Rohit', 'Rahul', 'Dhoni', 'Jadeja', 'Bumrah'];

  // Destructure odd and even players from the team array
  const [odd1, even1, odd2, even2, odd3, even3] = team;

  // Declare two arrays
  const T20players = ['Surya', 'Gill', 'Pant'];
  const RanjiTrophyPlayers = ['Pujara', 'Saha', 'Iyer'];

  // Merge them using spread operator
  const allPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team Players:</h2>
      <ul>
        <li>{odd1}</li>
        <li>{odd2}</li>
        <li>{odd3}</li>
      </ul>

      <h2>Even Team Players:</h2>
      <ul>
        <li>{even1}</li>
        <li>{even2}</li>
        <li>{even3}</li>
      </ul>

      <h2>Merged T20 & Ranji Trophy Players:</h2>
      <ul>
        {allPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
