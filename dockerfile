FROM adoptopenjdk/openjdk13:debianslim-slim
RUN mkdir /opt/app
ARG JAR_FILE
COPY ${JAR_FILE} /opt/app/app.jar
CMD ["java", "-jar", "/opt/app/app.jar"]