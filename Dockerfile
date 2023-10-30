FROM eclipse-temurin:11
RUN mkdir /opt/app
COPY target/foodsystem-0.0.1.jar /opt/app
CMD ["java", "-jar", "/opt/app/foodsystem-0.0.1.jar"]