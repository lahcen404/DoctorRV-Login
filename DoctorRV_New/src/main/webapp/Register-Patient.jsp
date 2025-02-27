<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-blue-100 flex items-center justify-center min-h-screen">
<div class="container mx-auto flex items-center justify-center">
    <div class="bg-white shadow-xl rounded-lg p-8 w-full max-w-md">
        <div class="flex items-center space-x-4 mb-6">
            <img src="./imgs/DoctorRV.png" alt="Logo" class="w-12 h-12">
            <h2 class="text-3xl font-bold text-green-700">Register Patient</h2>
        </div>
        <form class="space-y-4" action="patientRegister" method="post">
            <div>
                <label class="block text-green-800 font-semibold mb-1 text-left">Username</label>
                <input type="text" name="name" class="w-full px-4 py-2 border border-green-400 rounded-lg focus:outline-none focus:ring-2 focus:ring-green-600 bg-green-50" required>
            </div>
            <div>
                <label class="block text-green-800 font-semibold mb-1 text-left">Email</label>
                <input type="email" name="email" class="w-full px-4 py-2 border border-green-400 rounded-lg focus:outline-none focus:ring-2 focus:ring-green-600 bg-green-50" required>
            </div>
            <div>
                <label class="block text-green-800 font-semibold mb-1 text-left">Telephone</label>
                <input type="tel" name="phone" class="w-full px-4 py-2 border border-green-400 rounded-lg focus:outline-none focus:ring-2 focus:ring-green-600 bg-green-50" required>
            </div>
            <div>
                <label class="block text-green-800 font-semibold mb-1 text-left">Password</label>
                <input type="password" name="password" class="w-full px-4 py-2 border border-green-400 rounded-lg focus:outline-none focus:ring-2 focus:ring-green-600 bg-green-50" required>
            </div>
            <button type="submit" class="w-full py-3 rounded-lg font-semibold text-white bg-gradient-to-r from-green-500 to-green-600 hover:from-green-600 hover:to-green-700 transition transform hover:scale-105 shadow-md">Register</button>
            <a href="login.jsp" class="w-full text-center block border-2 border-blue-700 text-blue-700 py-3 rounded-lg font-semibold hover:bg-blue-700 hover:text-white transition">Login</a>
            <a href="Home.jsp" class="w-full text-center block border-2 border-gray-700 text-gray-700 py-3 rounded-lg font-semibold hover:bg-gray-700 hover:text-white transition">Back</a>
        </form>
    </div>
</div>
</body>
</html>
