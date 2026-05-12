<%--
  Created by IntelliJ IDEA.
  User: Geeth Kalhara
  Date: 5/12/2026
  Time: 4:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up</title>
    <!-- Bootstrap CSS link -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f0f2f5;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .signup-card {
            background: white;
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }
    </style>
</head>
<body>
<div class="signup-card">
    <h3 class="text-center mb-4 text-primary">Sign Up</h3>

    <form action="signup" method="post">
        <div class="mb-3">
            <label class="form-label fw-bold">Name</label>
            <input type="text" name="name" class="form-control" placeholder="Enter your name" required/>
        </div>

        <div class="mb-3">
            <label class="form-label fw-bold">Email</label>
            <input type="email" name="email" class="form-control" placeholder="example@mail.com" required/>
        </div>

        <div class="mb-3">
            <label class="form-label fw-bold">Mobile</label>
            <input type="text" name="mobile" class="form-control" placeholder="07xxxxxxxx" required/>
        </div>

        <div class="mb-3">
            <label class="form-label fw-bold">Password</label>
            <input type="password" name="password" class="form-control" placeholder="********" required/>
        </div>

        <div class="d-grid mt-4">
            <button type="submit" class="btn btn-primary btn-lg shadow-sm">Sign Up</button>
        </div>
    </form>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
