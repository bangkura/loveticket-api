FROM java:8
EXPOSE 8080
COPY target/loveticket-api.jar ./
CMD ["java", "-jar", "loveticket-api.jar"]