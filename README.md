# feign
Fegin声明式服务调用

### 1. 技术介绍

- Spring Boot 2.7.9
- Spring Cloud 2021.0.6
- Eureka
- Feign
  - 入门案例
  - 负载均衡
    - 全局策略
    - 局部策略
  - GET/POST方法
  - 性能调优
    - HTTP协议
    - GZIP压缩传输
    - HTTP连接池
  - 日志配置
  - 请求超时
- mysql
- docker

### 2. Fegin声明式服务调用
![image](https://user-images.githubusercontent.com/49580847/221726059-4361fd73-358b-4d5e-a721-fb05920cfeb8.png)


### 3. 核心要点
Feign的使用主要分为以下几个步骤:
- 服务消费者添加Feign依赖包
- 创建业务层接口,添加@Feinclient注解声明需要调用的微服务
- 业务层抽象方法使用SpringMVC注解配置服务地址以参数
- 启动类添加@EnableFeignClients注解激活Feign组件
