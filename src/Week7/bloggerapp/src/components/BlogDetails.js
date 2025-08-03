import React from 'react';

function BlogDetails() {
  const blogs = [
    {
      id: 1,
      title: "React Learning",
      author: "Stephen Biz",
      desc: "Welcome to learning React!"
    },
    {
      id: 2,
      title: "Installation",
      author: "Schewzdenier",
      desc: "You can install React from npm."
    }
  ];

  return (
    <div className="section">
      <h2>Blog Details</h2>
      {blogs.map((blog) => (
        <div key={blog.id}>
          <h3>{blog.title}</h3>
          <strong>{blog.author}</strong>
          <p>{blog.desc}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;
