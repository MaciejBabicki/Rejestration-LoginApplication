# General Info

Web application where administrator can perform CRUD functionalities of real programmers and users can search for. Application is connected to **Github API** to import the informations about repositories. The task is to give for the user possibility to find a specialist with concrete specialization and see repositories. 
I have designed this engine and thinking about two implementations:   
1) To find the programming-trainer for private lessons
2) To find an employee

## Technologies:

**Backend:** Java, SpringBoot, Hibernate, Security

**Testing:** JUnit, Mockito, MockMvc

**Frontend:** JavaScript, React.js, HTML, CSS, vite.js, bootstrap 

**Databese:** MySQL

**Security**: Spring Security

## Features

**User CRUD operations:** Programmer basic personal data with specialization Repository name

**Searching Repositories:** You can find the Github repositories for concrete programmer, filter not fork repositories, see the branches, last commits and more.

**Security:** To access the web page you have to log in.

![Programmers](https://github.com/MaciejBabicki/Programmers/assets/123827748/c271de49-bc31-4677-a039-b11874ff387e)

## Setup

**Clone the Repository**

Clone the repository or download the source code:
```
git clone <https://github.com/MaciejBabicki/Programmers.git>
```

**Configure Your Environment**

Ensure you have Java installed, version 8 or newer.

**Download External Libraries**

This project uses external libraries such as Spring Boot and Hibernate. Ensure that you have Maven installed, then navigate to the project directory and run:
```
mvn clean install
```
This command will download all required dependencies and build the project.

**Set Up the Database**

The application uses MySQL database. You need to set up a MySQL server and create a database for the application. Update the `application.properties` file in `src/main/resources` directory with your database configuration.

**Run the Application**

Once the database is set up and the project is built, you can run the application using the following command:
```
mvn spring-boot:run
```
This will start the Spring Boot application.

**Access the Application**

Once the application is running, you can access it at http://localhost:8080 in your web browser.
