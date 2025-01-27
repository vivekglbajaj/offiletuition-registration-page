document.getElementById("parent-registration-form").addEventListener("submit", function(event) {
    event.preventDefault(); // Prevent form submission

    // Collect form data
    const parentData = {
        full_name: document.getElementById("parent-name").value,  // Corrected the key to match the backend field name
        email: document.getElementById("parent-email").value,
        password: document.getElementById("parent-password").value,
        childName: document.getElementById("child-name").value,
        childGrade: document.getElementById("child-grade").value
    };

    // Send POST request to backend
    fetch('http://localhost:8080/api/registration/parent', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'  // Correct content type for JSON data
        },
        body: JSON.stringify(parentData)  // Convert the data to a JSON string
    })
    .then(response => {
        if (response.ok) {
            return response.json();  // Parse JSON response if successful
        }
        throw new Error('Failed to register parent');  // Throw error if the request fails
    })
    .then(data => {
        console.log('Parent registered:', data);
        alert('Parent registration successful!');
        // Redirect or perform additional actions (optional)
    })
    .catch(error => {
        console.error('Error:', error);
        alert('Error registering parent. Please try again.');
    });
});
