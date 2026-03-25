# Java Web 项目：学生选课系统 (SCT)

这是一个基于 Servlet + JSP + JDBC (MySQL) 开发的学生选课系统。

## 功能特性

- **多角色登录**：支持学生、老师、管理员三种身份。
- **学生功能**：查看课程、在线选课、查看成绩、修改个人信息。
- **老师功能**：管理个人课程、录入/修改学生成绩。
- **管理员功能**：学生管理、老师管理、课程管理、及格率统计、成绩分布图表。
- **图表展示**：集成 ECharts 展示成绩统计信息。

## 技术栈

- **依赖管理**：手动管理 JAR 包 (位于 `WebContent/WEB-INF/lib`)
- **Web容器**：Tomcat 11.0.18
- **编程语言**：Java 21.0.10
- **前端**：JSP, JSTL, jQuery, ECharts
- **后端**：Java Servlet, JDBC
- **数据库**：MySQL 8.0.45
- **数据库设计**: Power Designer
- **数据库连接池**：DBCP
- **数据库操作**: DBUtils

## 快速启动

1. **导入数据库**：
   - Navicat-连接-MySQL-端口3306，用户名root，密码123456（可以使用其他端口号、用户名、密码，但需要对应修改src/db.properties文件）
   - 右键新建的连接，新建数据库-数据库名sct。
   - 新建查询-复制粘贴项目根目录下的 `sct.sql` 文件内容并运行。
<img width="2100" height="1244" alt="屏幕截图 2026-03-25 204218" src="https://github.com/user-attachments/assets/a1ceeef8-ef7c-488c-9b85-28a01fa5ca2d" />

2. **部署项目**：
   - 将项目导入 IDE (Eclipse/IntelliJ IDEA/VS Code)。
   - 开启servers。
   - 运行并在浏览器访问 `http://localhost:8080/sct`。
<img width=40% alt="image" src="https://github.com/user-attachments/assets/228de2a2-9077-4ce5-826b-36d2dc681883" />

