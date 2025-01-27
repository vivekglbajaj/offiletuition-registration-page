document.addEventListener('DOMContentLoaded', function () {
    const form = document.getElementById('teacher-registration-form');

    form.addEventListener('submit', function (e) {
        e.preventDefault(); // Prevent the default form submission

        const formData = new FormData();
        formData.append("name", document.getElementById('teacher-name').value);
        formData.append("email", document.getElementById('teacher-email').value);
        formData.append("phone", document.getElementById('teacher-phone').value);
        formData.append("subject", document.getElementById('teacher-subject').value);
        formData.append("qualification", document.getElementById('teacher-qualification').value);
        formData.append("experience", document.getElementById('teacher-experience').value);
        formData.append("bio", document.getElementById('teacher-bio').value);
        formData.append("document", document.getElementById('teacher-document').files[0]);
        formData.append("profile-picture", document.getElementById('teacher-profile-picture').files[0]);

        // Sending the form data to the backend
        fetch('http://localhost:8080/api/registration/teacher', {
            method: 'POST',
            body: formData, // Send the FormData (including files)
        })
        .then(response => {
            if (response.ok) {
                return response.json(); // Parse the response as JSON
            } else {
                throw new Error('Failed to register teacher');
            }
        })
        .then(data => {
            console.log('Teacher registered successfully:', data);
            // You can show a success message or redirect the user
        })
        .catch(error => {
            console.error('Error:', error);
            // Handle the error (show error message)
        });
    });
});
