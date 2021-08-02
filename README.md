Lazy Example
=====

This example shows that primefaces datatable 8.0 with LazyDataModel is working properly with spring session.

## How to run the program working with primefaces 8.0 and spring session

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

1- It works with spring session if primefaces datable DataModel is not lazy.

2- The error happens with Primefaces 10.
