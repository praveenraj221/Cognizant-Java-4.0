import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat', score: 95 },
    { name: 'Rohit', score: 88 },
    { name: 'Rahul', score: 65 },
    { name: 'Dhoni', score: 40 },
    { name: 'Jadeja', score: 78 },
    { name: 'Bumrah', score: 59 },
    { name: 'Ashwin', score: 71 },
    { name: 'Gill', score: 32 },
    { name: 'Pant', score: 85 },
    { name: 'Shami', score: 69 },
    { name: 'Surya', score: 100 },
  ];

  // Arrow function to filter players with score < 70
  const below70 = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players:</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h2>Players with Score Below 70:</h2>
      <ul>
        {below70.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
