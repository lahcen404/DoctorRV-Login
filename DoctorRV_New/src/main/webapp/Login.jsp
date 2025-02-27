<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-blue-100 flex items-center justify-center min-h-screen">
<div class="container mx-auto flex items-center justify-center">
    <div class="bg-white shadow-xl rounded-lg p-8 w-full max-w-md">
        <div class="flex items-center space-x-4 mb-6">
            <img src="./imgs/DoctorRV.png" alt="Logo" class="w-12 h-12">
            <h2 class="text-3xl font-bold text-blue-700">Login</h2>
        </div>
        <!-- Form will now POST to LoginServlet -->

        <!-- Display error message if present -->
        <% if (request.getAttribute("errorMessage") != null) { %>
        <p style="color: red;"><%= request.getAttribute("errorMessage") %></p>
        <% } %>


        <form action="LoginServlet" method="post" class="space-y-4">
            <div>
                <label class="block text-blue-800 font-semibold mb-1 text-left">Email</label>
                <input type="text" name="email" class="w-full px-4 py-2 border border-blue-400 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-600 bg-blue-50" required>
            </div>
            <div>
                <label class="block text-blue-800 font-semibold mb-1 text-left">Password</label>
                <input type="password" name="password" class="w-full px-4 py-2 border border-blue-400 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-600 bg-blue-50" required>
            </div>
            <button type="submit" class="w-full py-3 rounded-lg font-semibold text-white bg-gradient-to-r from-blue-500 to-blue-600 hover:from-blue-600 hover:to-blue-700 transition transform hover:scale-105 shadow-md">Login</button>
        </form>
        <a href="Register-Patient.jsp" class="w-full text-center block border-2 border-green-700 text-green-700 py-3 rounded-lg font-semibold hover:bg-green-700 hover:text-white transition">Register</a>
        <a href="Home.jsp" class="w-full text-center block border-2 border-gray-700 text-gray-700 py-3 rounded-lg font-semibold hover:bg-gray-700 hover:text-white transition">Home</a>
    </div>
</div>
</body>
</html>
