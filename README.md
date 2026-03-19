# 🎓 UniCore — University Management System

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white" />
  <img src="https://img.shields.io/badge/Swing-GUI-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Status-Active-brightgreen?style=for-the-badge" />
  <img src="https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge" />
</p>

<p align="center">
  <b>UniCore</b> is a smart and efficient University Management System designed to streamline academic and administrative operations in one centralized platform.
</p>

## 📌 About the Project

Managing a university's day-to-day operations — from student enrollment to faculty assignments, course handling to fee collection — involves enormous administrative overhead. **UniCore** was built to eliminate that burden.

UniCore consolidates all core university functions into a single desktop application, reducing manual errors, saving time, and giving administrators full visibility into institutional data at a glance.

> ⭐ **UniCore — The Core of Smart University Management**

---

## 🚀 Features

| Module | Description |
|---|---|
| 🎓 **Student Management** | Add, update, search, and remove student records |
| 👨‍🏫 **Faculty Management** | Manage faculty profiles, assignments, and departments |
| 📚 **Course & Department Handling** | Create and manage courses, link them to departments |
| 💳 **Fee Management System** | Track fee payments, dues, and generate receipts |
| 📊 **Result & Records Management** | Record and view academic results per student/course |
| 🔒 **Secure Login System** | Role-based authentication for admins and staff |

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| **Language** | Java (JDK 8+) |
| **GUI Framework** | Java Swing |
| **Database** | MySQL |
| **connectivity** | JDBC |
| **IDE** | IntelliJ IDEA |
| **Build Tool** | IntelliJ Module (`.iml`) |
| **CI/CD** | GitHub Actions |

---

## 📁 Project Structure

```
UniCore/
│
├── .github/
│   └── workflows/          # GitHub Actions CI configuration
│
├── .idea/                  # IntelliJ IDEA project settings
│
├── src/                    # All Java source files
│   ├── welcome.java        # Application entry point
│   ├── login/              # Login & authentication module
│   ├── student/            # Student management module
│   ├── faculty/            # Faculty management module
│   ├── course/             # Course & department module
│   ├── fee/                # Fee management module
│   └── result/             # Results & records module
│
├── .gitignore
├── README.md
└── university_management_system.iml
```

---

## 🏁 Getting Started

### Prerequisites

Make sure you have the following installed:

- [Java JDK 8 or higher](https://www.oracle.com/java/technologies/downloads/)
- [MySQL Server](https://dev.mysql.com/downloads/mysql/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (recommended) or any Java IDE
- MySQL JDBC Connector (add to project classpath)

---

### Installation

1. **Clone the repository:**

```bash
git clone https://github.com/suvamkabi-software/UniCore.git
cd UniCore
```

2. **Open the project in IntelliJ IDEA:**
   - Go to `File → Open` and select the `UniCore` folder.
   - IntelliJ will auto-detect the `.iml` file and configure the project.

3. **Add MySQL JDBC Driver to classpath:**
   - Download [`mysql-connector-java.jar`](https://dev.mysql.com/downloads/connector/j/)
   - Go to `File → Project Structure → Libraries → + → Java`
   - Select the downloaded `.jar` file.

---

### Database Setup

1. Open your MySQL client and create the database:

```sql
CREATE DATABASE unicore_db;
USE unicore_db;
```

2. Import the schema (if provided) or manually create the required tables for students, faculty, courses, fees, and results.

3. Update the database connection credentials in the source file(s) where the JDBC connection is configured:

```java
String url = "jdbc:mysql://localhost:3306/unicore_db";
String user = "your_mysql_username";
String password = "your_mysql_password";
```

---

### Running the Application

After completing the setup, run the entry point:

```
src/welcome.java
```

In IntelliJ IDEA, right-click `welcome.java` → **Run 'welcome.main()'**

The welcome/login screen will launch and you can log in with your admin credentials.

---

## 📦 Modules Overview

### 🎓 Student Management
- Register new students with personal and academic details
- Search, view, and update existing student profiles
- Delete or deactivate student records

### 👨‍🏫 Faculty Management
- Add and manage faculty members
- Assign faculty to departments and courses
- View faculty workload and records

### 📚 Course & Department Handling
- Create university departments
- Add courses under specific departments
- Assign courses to semesters or terms

### 💳 Fee Management System
- Record fee payments per student
- Track pending dues and generate payment summaries
- View fee history per student

### 📊 Result & Records Management
- Enter marks and grades per subject
- Calculate and store final results
- Generate result summaries per batch or student

### 🔒 Secure Login System
- Admin and staff login with credential validation
- Session management to prevent unauthorized access



## 🌟 Future Improvements

- [ ] 🌐 **Web-based version** — Migrate from Swing to a web UI (React / Spring Boot)
- [ ] 📱 **Mobile app integration** — Android/iOS companion app
- [ ] 📈 **Advanced analytics dashboard** — Visual insights on enrollment, results, and fees
- [ ] 🔔 **Notification system** — Email/SMS alerts for fee dues, results, and notices
- [ ] 📄 **Report generation** — Export data to PDF/Excel
- [ ] 🔑 **Role-based access control** — Granular permissions for admin, faculty, and students

---

## 🤝 Contributing

Contributions are welcome! To contribute:

1. Fork the repository
2. Create a feature branch: `git checkout -b feature/your-feature-name`
3. Commit your changes: `git commit -m "Add your feature"`
4. Push to the branch: `git push origin feature/your-feature-name`
5. Open a Pull Request

Please ensure your code follows the existing style and all modules are tested before submitting.

---

## 👨‍💻 Author

**Suvam Kabi**

- GitHub: [@suvamkabi-software](https://github.com/suvamkabi-software)

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

<p align="center">
  Made with ❤️ by <a href="https://github.com/suvamkabi-software">Suvam Kabi</a> &nbsp;|&nbsp; ⭐ Star this repo if you find it helpful!
</p>

<h2>Project Screenshot</h2>

<p align="center">
<img src="login_page.png" width="600">
</p>

<p align="center">
<img src="https://github.com/suvamkabi-software/SecureBank-Management-System/blob/f72d22ae6641d1b4285ac9cd0f30b4656aeadc35/form.jpg" width="600">
</p>
<p align="center">
<img src="transa.jpg" width="600">
</p>


https://github.com/user-attachments/assets/79246114-6c29-4118-9f9b-27a2ecda93a4





     
