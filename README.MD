# Spring Boot
> Spring Boot 使用`习惯优于配置` 的理念让你的项目快速运行起来，
> 使用Spring Boot 你可以不用或者只需要很少的Spring配置

## Spring Boot 优点
1. 快速构建项目
2. 对主流框架无配置集成
3. 项目可独立运行，无须依赖外部的Servlet容器
4. 提供运行时的应用监控
5. 极大地提高了开发、部署的效率
6. 与云计算的天然集成

## 如何运行部署
1. `java -jar xx.jar` 可选择内置的 Tomcat、Jetty、Undertow
2. war部署

## 特性
### 使用配置
1. @Import 可以导入配置Bean
2. @ImportResource 可以导入配置文件

### 命令行参数
1. java -jar xx.jar --server.port=9090
2. java -Dserver.port=9090 -jar xx.jar

### 日志
logging.file=路径
logging.level.org.springframework.web=DEBUG/INFO

## Profile 配置
spring.profiles.active=dev/test/prod

## Spring Boot 原理









