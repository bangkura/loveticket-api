FROM java:8
VOLUME /tmp
EXPOSE 8080
COPY target/loveticket-api-0.0.1.jar ./
CMD ["java", "-jar", "loveticket-api-0.0.1.jar"]