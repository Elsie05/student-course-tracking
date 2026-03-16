# Java Web 项目：学生选课系统 (SCT)

这是一个基于 Servlet + JSP + JDBC (MySQL) 开发的学生选课系统。

## 功能特性

- **多角色登录**：支持学生、老师、管理员三种身份。
- **学生功能**：查看课程、在线选课、查看成绩、修改个人信息。
- **老师功能**：管理个人课程、录入/修改学生成绩。
- **管理员功能**：学生管理、老师管理、课程管理、及格率统计、成绩分布图表。
- **图表展示**：集成 ECharts 展示成绩统计信息。

## 技术栈

- **后端**：Java Servlet, JDBC
- **数据库**：MySQL 8.0+
- **前端**：JSP, JSTL, jQuery, ECharts
- **依赖管理**：手动管理 JAR 包 (位于 `WebContent/WEB-INF/lib`)
- **服务器**：Tomcat 10+ (Jakarta EE 兼容)

## 快速启动

1. **导入数据库**：
   - 创建名为 `sct` 的数据库。
   - 运行项目根目录下的 `sct.sql` 文件导入表结构和初始数据。

2. **修改数据库配置**：
   - 修改 `src/db.properties` 文件，确保 `username` 和 `password` 与您的 MySQL 设置匹配。
   - *注意：如果使用 MySQL 8.x，驱动程序已更新为 `com.mysql.cj.jdbc.Driver`。*

3. **部署项目**：
   - 将项目导入 IDE (Eclipse/IntelliJ IDEA)。
   - 配置 Tomcat 10 或 11 服务器。
   - 运行并访问 `http://localhost:8080/sct`。

## 注意事项

- **SSL 问题**：如果遇到数据库连接失败，请在 `db.properties` 的 URL 后添加 `&useSSL=false&allowPublicKeyRetrieval=true`。
- **Jakarta EE**：本项目使用 `jakarta.servlet` 包名，请确保服务器版本支持 Jakarta EE。
