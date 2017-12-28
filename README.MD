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
### 核心注解
``` java
@ConditionalOnBean 当容器里有指定Bean的情况下
@ConditionalOnClass 当类路径下有指定类的条件下
@ConditionalOnExpression SpEL 表达式作为判断条件
@ConditionalOnJava 基于JVM版本作为判断条件
@ConditionalOnJndi 在JNDI存在的条件下查找指定的位置
@ConditionalOnMissingBean 在容器里没有指定Bean的情况下
@ConditionalOnMissingClass 当类路径下没有指定类的情况下
@ConditionalOnNotWebApplication 当前项目不是Web项目的条件下
@ConditionalOnProperty 指定的属性是否有指定的值
@ConditionalOnResource 类路径是否有指定的值
@ConditionalOnSingleCandidate 当指定的Bean在容器中只有一个， 或者虽然有多个但是指定首选的Bean
@ConditionalOnWebApplication 当前项目是Web项目的条件下
```









