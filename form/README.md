# backend-interview-assignment

## Using GIT

### clone
- Command
```
git clone git@github.com:Vaibhav8881/user-form-assignment.git
cd interview-assignments
```

### Using Maven 

### build
- Command
```
mvn clean install -DskipTests
```

### run
- Command
```
java -jar target/form-0.0.1-SNAPSHOT.jar
```

### curl request
```
curl --location 'localhost:8080/submitForm' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName":"Vaibhav",
    "middleName":"",
    "lastName" : "Singh",
    "age":27,
    "location":"Dehli",
    "gender":"M",
    "email":"singhVaibhav@gmail.com"
}'
```
