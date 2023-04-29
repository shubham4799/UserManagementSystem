# Assignment_User_Management(Validation on project) 
## Validation types
1.Manual Validation   
2.Annotation Validation
## Requirements
IntelliJIDEA
 Server port: 8080 (use: localhost:8080)
 Java version: 17
Everything is present in the pom.xml (no need to download any library)
Dependencies needed Spring Boot DevTools,Lombok,Spring Web.
## Dependencies used
### Spring Boot DevTools
* Provides fast application restarts, LiveReload, and configurations for enhanced development experience
### Lombok
* Java annotation library which helps to reduce boilerplate code
### Spring Web
* Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container
### Validations
*  Using validations it validate the data provided by user should be valide as per the annotation
## WORKING
I have used validations through annotations on model class attributes where all the validation part will be taken by the annotations ,annotations used are...@NotBlank ,@NotNull, @Email, @Length, etc,..
Manual validation is done in this project while user is trying to get user by I'd, if the user doesn't exist then I'm handling it and even for updating and deletion processes
