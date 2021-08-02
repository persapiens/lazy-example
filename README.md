Lazy Example
=====

This example shows that primefaces datatable with LazyDataModel is not working properly with spring session.

## How to run the program working without spring session

1- Compile the example with 
```Shell
./mvnw install
```

2- Run the example with
```Shell
java -jar target/lazy-example-1.0-SNAPSHOT.jar
```

3- Access the program in your browser with http://localhost:8080/

4- Click any "Select" link in the datatable. You'll see the message with the selected customer.

## How to reproduce the error with spring session

1- Run redis server on localhost port 6379

2- Activate spring session in pom.xml. Uncomment the section with message "Uncomment here to enable spring-session."

3- Compile the example with 
```Shell
./mvnw install
```

4- Run the example with
```Shell
java -jar target/lazy-example-1.0-SNAPSHOT.jar
```

5- Access the program in your browser with http://localhost:8080/

6- Click any "Select" link in the datatable. Unfortunately, the customer is not selected and nothing happens.

## Some notes

1- It works if you disable spring session. You could check it removing spring-session-data-redis and spring-boot-starter-data-redis libraries in pom.xml.

2- It works with spring session if primefaces datable DataModel is not lazy.

3- The error happens with Primefaces 10.
