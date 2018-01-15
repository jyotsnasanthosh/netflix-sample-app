# netflix-sample-app
A sample netflix app showcasing Eureka, Feign, Zuul and Hystrix.

This application contains 2 microservices - NetflixStudentApp(which has basic info of students) and NetflixStudentDetails(Detailed info of students).
NetflixStudentApp communicates with NetflixStudentDetails to fetch the complete details of the student.
NetflixZuulGateway routes to the various microservices. All the services are registered in the NetflixEurekaServer.
Circuit breaker is implemented using NetflixHystrix.

### prerequisites
1. Java 1.8
2. Maven 3.5.2
3. Tomcat 7
4. Postgresql 42.1.4
5. Spring Tool Suite IDE

### setup
1. Clone this project
2. Open NetflixEurekaServer, NetflixStudentApp, NetflixStudentDetails, NetflixZuulGateway and NetflixHystrix as separate maven projects.
3. Update maven dependencies in all.
4. Create database and change configuration accordingly in both NetflixStudentApp and NetflixStudentDetails.
5. Take separate jar builds of all projects and run them on server.
6. Hit `http://localhost:8671` to see the Eureka server portal and running instances.
7. To run the services in NetflixStudentApp, hit via Zuul : 
	`http://localhost:8675/students/action/get?id=` || `http://localhost:8675/students/action/add` || `http://localhost:8675/students/action/getAll`

8. To run the services in NetflixStudentDetails, hit via Zuul : 
	`http://localhost:8675/studentDetails/get?id=` || `http://localhost:8675/studentDetails/add` || `http://localhost:8675/studentDetails/getAll`
	
9. To check Hystrix, stop running the NetflixStudentApp and try hitting `http://localhost:8602/circuitBreaker` and the fallback method should be running.

### code style formatter
[Spring Boot Java Conventions](https://gist.github.com/jyotsnasanthosh/e2fb456f0ff91aa42ad8203e148bff79)
Save this as xml and import into eclipse -> window -> preferences -> java -> code style -> formatter