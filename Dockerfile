FROM java:8
VOLUME /tmp

COPY target/loveticket-0.0.1.jar ./
CMD ["java", "-jar", "loveticket-api-0.0.1.jar"]