import React from 'react';

class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            hasError: false,
        };
    }

    // Fetch posts from the API
    loadPosts() {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response => response.json())
            .then(data => {
                this.setState({ posts: data.slice(0, 10) }); // Show only first 10 posts
            })
            .catch(error => {
                this.setState({ hasError: true });
                console.error('Error fetching posts:', error);
            });
    }

    // Lifecycle hook to call loadPosts() after mount
    componentDidMount() {
        this.loadPosts();
    }

    // Lifecycle hook to handle rendering errors
    componentDidCatch(error, info) {
        alert("An error occurred: " + error);
        this.setState({ hasError: true });
        console.error("Error Info:", info);
    }

    // Renders the posts
    render() {
        if (this.state.hasError) {
            return <h2>Something went wrong while loading posts.</h2>;
        }

        return (
            <div>
                <h2>Blog Posts</h2>
                {this.state.posts.map(post => (
                    <div key={post.id} style={{ marginBottom: '10px', padding: '10px', border: '1px solid #ccc' }}>
                        <h3>{post.title}</h3>
                        <p>{post.body}</p>
                    </div>
                ))}
            </div>
        );
    }
}

export default Posts;
