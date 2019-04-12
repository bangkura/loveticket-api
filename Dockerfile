FROM java:8
VOLUME /tmp
COPY /var/jenkins_home/workspace/loveticket-api/target/loveticket-0.0.1.jar .
CMD ["java", "-jar", "loveticket-api-0.0.1.jar"]