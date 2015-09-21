Application: Development Environments
Author:  Jeanette Fairless
GitHub:  https://github.com/RocketGirl626/devEnvironments

Description:  This application uses the Struts2 framework to create a java application to insert and list
development environment data using a MySQL database.  OS, Version, and Notes are the properties acted on, with 
OS and Version as required fields. The application runs in the Tomcat server.

The application consists of three pages: index, add a record, and list records.


Configuration and Deployment

Database:

1.  Download MySql and MySQL Connector from https://dev.mysql.com/downloads/. Install MySQL and copy the jar file 
"mysql-connector-java.5.1.36-bin.jar into the lib folder in the Tomcat directory.

2.	In the terminal, start MySql:  mysql -u root -p -h localhost 

3.  Credentials:
	Username - "root"
	Password - ""
	Port - 3307
	
4. Create the database: CREATE DATABASE dev_environments;

5. Display databases: SHOW DATABASES;

5. Select database: USE dev_environments;

6. Create the table:  CREATE TABLE environments (id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
   os VARCHAR(30), version VARCHAR(20), notes VARCHAR(200));
   
   
Tomcat:

1. Deploy the DevEnvironments.war file to the webapps folder in the Tomcat directory.

2. Start the Tomcat server: ./startup

3.  View the application at:  http://localhost:8080/DevEnvironments


Author's Notes and Future Enhancements

The following are observations, known issues, and plans for future enhancements.  My plan is to continue 
working on the application, host it, and feature on my portfolio website.

1. 	This code needs to be refactored.

2. 	The database needs to be normalized, for example a one-to-many between os:version.

3. 	The validation works but the error message is not displaying on the screen. If OS or Version is
	left blank, the form will not submit but no message is displayed. This needs more research and
	debugging.
	
4. 	I had a lot of problems setting up a stable database connection.  The connection is 
	configured as: Connection con = DriverManager.getConnection("jdbc:mysql:
	//localhost:3307/dev_environments?user=root&passwrod="); I looked into setting up a 
	config file for this but just ran out of time. I will research and implement this 
	capability.
	
5.	The additional CRUD functionality Update and Delete needs to be added.

6.	The application is small, but has no TDD.  Going forward I will implement automated testing.

7. 	No styling on the front-end, but could be easily provided with Bootstrap.
	

	
			


