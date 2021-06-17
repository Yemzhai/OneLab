# OneLab projects
### Languages and Tools
![Java](https://img.shields.io/badge/-Java-090909?style=for-the-badge&logo=java&logoColor=f89820)
![Java](https://img.shields.io/badge/-RestApi-090909?style=for-the-badge&logo={}&logoColor=f89820)
![Spring](https://img.shields.io/badge/-SpringBoot-090909?style=for-the-badge&logo=spring)
![PostgreSQL](https://img.shields.io/badge/-PostgreSQL-090909?style=for-the-badge&logo=PostgreSQL&logoColor=2a9df4)
![Camunda](https://img.shields.io/badge/-Camunda-090909?style=for-the-badge&logo=BPM&logoColor=2a9df4)
![Spring](https://img.shields.io/badge/-SpringCloud-090909?style=for-the-badge&logo=spring)

<h2 align="center"><a href="https://github.com/Yemzhai/OneLab/tree/main/FirstProject">First Project </a></h2>

## Requirements
<hr>

![requirements](https://user-images.githubusercontent.com/51040580/121328733-67186100-c936-11eb-887b-114daf6227e9.jpg)

## How to launch the project?
<hr>

### First of all in this project we use postgreSQL and in application.properties file (FirstProject->src->main->resources->application.properties) you should to write your Data Base name and your pgAdmin password! After that you can launch)
![image](https://user-images.githubusercontent.com/51040580/121703803-ff5c4480-caf4-11eb-84bf-63a335df6e53.png)


<h2 align="center"> <a href="https://github.com/Yemzhai/OneLab/tree/main/comundaFirstApp"> Second Project </a> </h2>

## About
<hr>

### This mini project did with CamundaBPMN and about a battle between Kazakh and Zhongar (hahahah)   

![image](https://user-images.githubusercontent.com/51040580/121706348-5d8a2700-caf7-11eb-8cd9-65484387cdf0.png)

## How to launch the project?
<hr>

### First thing first you have to install Camunda by this <a href = "https://camunda.com/download/"> link </a> and install Camunda Modeler by this <a href = "https://camunda.com/download/modeler/"> link </a>. And last thing is for working with spring+comunda use this <a href="https://start.camunda.com/">link</a> for start camunda in spring   And you can start the project using your idea f.e. (intellij idea)

### <strong> Camunda </strong> - is used to manage a business 

### <strong> Camunda Modeler </strong>  - it is necessary so that you can build the idea of management through ready-made tools


<h2 align="center"> <a href="https://github.com/Yemzhai/OneLab/tree/main/ThirdProject"> Third Project </a> </h2>

## About

### In this project we will try to connect our projects. BUT WHY ??????  <u><strong><a href="https://habr.com/ru/post/484130/">Let's talk about microservices !</a></strong></u> You should to read it before we start. 
## <strong>So what's our target ?!</strong>
### We have to connect 2 projects using the server and through the second project we somehow have to get information from the first project. 
## <strong>How to do this ?!</strong>
### And here we get acquainted with <i>Spring Cloud</i> more precisely with <a href="https://www.tutorialspoint.com/spring_boot/spring_boot_eureka_server.htm#:~:text=Advertisements,each%20port%20and%20IP%20address."><i>Eureka</i></a> and with <a href="https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html#:~:text=Feign%20is%20a%20declarative%20web,writing%20web%20service%20clients%20easier.&text=Spring%20Cloud%20adds%20support%20for,http%20client%20when%20using%20Feign."><i>Feign</i></a>
## <strong>Let's move on to the project !!!</strong>
### Creating a project and creating a eureka server (<a href="https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-eureka-server">link</a> to maven repository) inside it. <i>This is the my ThirdProject.</i> Next, I want to take the information from the <i>FirstProject</i>, then it will be my eureka client (<a href="https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-eureka-client">link</a> to maven repository). And we tell him to register in eureka server. Then, using Сamunda, I want to take and work with the information from the FirstProject. To do this, created a project camunda-with-firstProject.It is also a Eureka client and it is a Fiegn client (<a href="https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-openfeign">link</a> to maven repository). 
## <strong>How to start it ?!</strong>
### First start eureka server. And then you launch client projects. By going to the server port you will see your client projects, like this.
![image](https://user-images.githubusercontent.com/51040580/122482163-da366d00-cff1-11eb-8e57-44d4ecb8afe9.png)
### This means that everything is going well. Then open the feign client project. In my case, this is Camunda
![image](https://user-images.githubusercontent.com/51040580/122482532-8ed08e80-cff2-11eb-80f7-45bed6b0a7da.png)

### When you click on start process and enter the fields you got the result then congratulations you did it!
![image](https://user-images.githubusercontent.com/51040580/122482773-07374f80-cff3-11eb-94f5-dc7b0cfa46fc.png)




