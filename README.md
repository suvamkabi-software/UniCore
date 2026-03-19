<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>UniCore</title>

<style>
    body {
        margin: 0;
        font-family: 'Segoe UI', sans-serif;
        background: linear-gradient(135deg, #020617, #0f172a);
        color: #e2e8f0;
        overflow-x: hidden;
    }

    .container {
        width: 85%;
        margin: auto;
        padding: 20px;
    }

    h1 {
        font-size: 50px;
        text-align: center;
        background: linear-gradient(90deg, #38bdf8, #22c55e);
        -webkit-background-clip: text;
        color: transparent;
        animation: fadeIn 1.5s ease-in-out;
    }

    p {
        text-align: center;
        color: #94a3b8;
    }

    .box {
        background: rgba(30, 41, 59, 0.6);
        backdrop-filter: blur(10px);
        padding: 20px;
        border-radius: 15px;
        margin: 20px 0;
        transition: 0.3s;
        box-shadow: 0 0 20px rgba(56, 189, 248, 0.1);
    }

    .box:hover {
        transform: translateY(-5px) scale(1.02);
        box-shadow: 0 0 25px rgba(56, 189, 248, 0.4);
    }

    h2 {
        color: #38bdf8;
    }

    ul {
        list-style: none;
        padding: 0;
    }

    ul li {
        padding: 5px 0;
    }

    ul li::before {
        content: "✔ ";
        color: #22c55e;
    }

    code, pre {
        background: #020617;
        padding: 10px;
        border-radius: 5px;
        display: block;
        margin-top: 10px;
        color: #38bdf8;
        overflow-x: auto;
    }

    a {
        color: #38bdf8;
        text-decoration: none;
    }

    .footer {
        text-align: center;
        margin-top: 40px;
        font-size: 14px;
        color: #64748b;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(-20px); }
        to { opacity: 1; transform: translateY(0); }
    }

</style>
</head>

<body>

<div class="container">

    <h1>🎓 UniCore</h1>
    <p><b>UniCore</b> is a smart and efficient <b>University Management System</b> 
    designed to manage academic and administrative tasks in one centralized platform.</p>

    <div class="box">
        <h2>🚀 Features</h2>
        <ul>
            <li>Student Management</li>
            <li>Faculty Management</li>
            <li>Course & Department Handling</li>
            <li>Fee Management System</li>
            <li>Result & Records Management</li>
            <li>Secure Login System</li>
        </ul>
    </div>

    <div class="box">
        <h2>🛠️ Tech Stack</h2>
        <p><b>Frontend:</b> Java Swing (GUI)</p>
        <p><b>Backend:</b> Java</p>
        <p><b>Database:</b> MySQL</p>
    </div>

    <div class="box">
        <h2>⚙️ Installation</h2>
        <p>Clone the repository:</p>
        <code>git clone https://github.com/suvamkabi-software/UniCore.git</code>
        <p>Open in IDE and run <code>login.java</code></p>
    </div>

    <div class="box">
        <h2>📂 Project Structure</h2>
        <pre>
UniCore/
│── src/
│   ├── university/management/system/
│   │   ├── login.java
│   │   ├── student.java
│   │   ├── teacher.java
│   │   ├── fee_form.java
│   │   └── ...
│
│── database/
│   └── schema.sql
│
│── images/
│── README.md
        </pre>
    </div>

    <div class="box">
        <h2>🎯 Objective</h2>
        <p>To reduce manual work, improve efficiency, and provide a centralized system for managing university operations.</p>
    </div>

    <div class="box">
        <h2>🌟 Future Improvements</h2>
        <ul>
            <li>Web-based version</li>
            <li>Mobile app integration</li>
            <li>Advanced dashboard</li>
            <li>Notification system</li>
        </ul>
    </div>

    <div class="box">
        <h2>👨‍💻 Author</h2>
        <p><b>Suvam Kabi</b></p>
        <p>GitHub: <a href="https://github.com/suvamkabi-software">suvamkabi-software</a></p>
    </div>

    <div class="footer">
        <p>⭐ UniCore – The Core of Smart University Management</p>
    </div>

</div>

</body>
</html>
