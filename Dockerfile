# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM amazoncorretto:11-alpine-jdk
MAINTAINER obrii.org

COPY src/main/resources/lection8-0.0.1-SNAPSHOT.jar docker2.jar
ENTRYPOINT ["java","-jar","/docker.jar"]

