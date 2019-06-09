# item-service-springboot-java11
This code base has the code to run a spring boot application in a Java 11 environment.

## Build the application

```youtrack
./gradlew clean build
```

## Launch the application

```youtrack
 java -jar -Dspring.profiles.active=prod build/libs/item-service-springboot-java11-0.0.1-SNAPSHOT.jar
```


## Docker

### Build the docker image

-   The Docker build options are explained here.  
    **-t** -> Providing a tag name for the docker image.
    
-   The below command creates a docker image with name **item-service** and the tag is **1.0**.
     
```youtrack
docker build -t item-service:1.0 . 
```

### Command to Run the Docker Image

```youtrack
docker run -p 8090:8080 -t item-service:1.0
```

### Access the application inside the container.

```youtrack
curl http://localhost:8090/v1/greeting
```

```youtrack
curl http://localhost:8090/v1/items
```
