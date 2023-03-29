# Tasks

Before continuing, finsih *Task 1* from prevoius week. 

## week04/Tasks 1
Create a new Spring Boot project with Spring [initializr](https://start.spring.io/). In the main class implement CommandLineRunner interface. Move the Dealership store logic in the newly create spring boot project. Rewrite object creation with Spring bean definition (IoC). Project definition from last lab -> [DealershipProject](https://github.com/dreamix-fmi-course-2023/web-development-with-Java/tree/main/week03/labs/FMICourse2023/src/com/fmi/week03). Package definition:
* labs.week03.model - defined base object structure (Invoice, Car)
* labs.week03.service - defined the business logic 
* labs.week03.repository - simulating operation with DB where DB is Map structure. 

## New tasks
For all your tasks use your Dealership system project from week04

## Task 0
Implement two [logging](https://www.graylog.org/post/server-log-files-in-a-nutshell#:~:text=A%20server%20log%20file%20is,or%20the%20application%20was%20accessed.) mechanism to show data from your application - to a console and to a file

Your custom loggers must implement the following interface:
```
public interface Logger {

    void info(Object toLog);

    void debug(Object toLog);

    void trace(Object toLog);

    void error(Object toLog);
}
```

The first implementation should use the STDOUT (standard output -> System.out.println)

The second one should store information inside file (use the code snippet bellow)
```
private void logInformation(Object toLog, LoggerLevel currentLoggerLevel) {
    File log = new File("log.txt");
    try (PrintWriter out = new PrintWriter(new FileWriter(log, true))) {
        out.println(new Date() + " [" + currentLoggerLevel.getLabel() + "] - " + toLog);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

```

Based on the logging level defined inside the application.propeties limit the information that you log inside your application.

Logging parameters: INFO, DEBUG, TRACE
```
INFO level log only INFO
DEBUG level log INFO & DEBUG
TRACE level log INFO & DEBUG & TRACE
```
error log is always shown.


Based on your active spring profile you must use the appropriate implementation
For example 
```
local profile to use the STDOUT implementation
dev profile to use the FILE implementation
```

## Task 1
Finish your implementation for Dealership system from week04.
Use your custom logger inside it.

Example. log data when you enter creation method -> logger.info("createEvent triggered");


## Task 2
Implement data reading from the application.properties file.

Add inside it a minimum/maximum value for invoice tax rate field. Then use this values for your invoice creation method

```
use the following notation
config.invoice.maximum_tax_rate
config.event.maximum_seat
```

Tips: you can use @Value or AppConfig class from lecture example. 
[similar class implementation](https://github.com/GeorgiMinkov/smart-garden/blob/master/ms-smart-garden/src/main/java/bg/unisofia/fmi/robotcourse/config/AppConfig.java) and
[property file](https://github.com/GeorgiMinkov/smart-garden/blob/master/ms-smart-garden/src/main/resources/application.properties)

## Task 3
Create different profiles named: USADealership, EuroDealership

Based on the runned spring profile initilize two list with different dealearship names.

Single example:
```
config.dealership.name=Best USA deals LTD,Test
```

From those list initilized simple Dealership (most data can be randomly generated/hard-coded)

## Bonus Task (Task 2 week04)
For your Dealership platform create a simple get all vehicle REST endpoint

Steps:

- add web starter dependency (Additional info: Starter of Spring web uses Spring MVC, REST and Tomcat as a default embedded server. The single spring-boot-starter-web dependency transitively pulls in all dependencies related to web development. It also reduces the build dependency count.)
```
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
```

- create a controller package
- use @RestController (Additional info: you can use @Controller but, @RestController annotation in order to simplify the creation of RESTful web services. It's a convenient annotation that combines @Controller and @ResponseBody, which eliminates the need to annotate every request handling method of the controller class with the @ResponseBody annotation.)
- use @GetMapping (Additional info: Annotation for mapping HTTP GET requests onto specific handler methods. Specifically, @GetMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. GET) .)

Example:
```
@RestController
@RequestMapping("example")
public class SimpleBookRestController {
    
    @GetMapping("/books")
    public Book getBook() {
        return service.getBooks();
    }
}
```
