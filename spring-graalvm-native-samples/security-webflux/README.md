Spring Boot project with Spring Webflux, Security, Netty and Jackson.

To build and run the native application packaged in a lightweight container with `default` mode:
```
mvn spring-boot:build-image
docker-compose up
```

To do it with `hybrid` mode:
```
mvn -P hybrid spring-boot:build-image
docker-compose up
```

And then go to [http://localhost:8080/](http://localhost:8080/).

As an alternative, you can use `build.sh` (with a local GraalVM installation or combined with
`run-dev-container.sh` at the root of `spring-graalvm-native` project). See also the related issue
[Take advantage of Paketo dev-oriented images](https://github.com/spring-projects-experimental/spring-graalvm-native/issues/227).