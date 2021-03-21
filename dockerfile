FROM adoptopenjdk/openjdk13:debianslim-slim
RUN mkdir /opt/app
ARG JAR_FILE
COPY ${JAR_FILE} /opt/app/app.jar
EXPOSE 80
ENV MAIL_HOST
ENV MAIL_PORT
ENV MAIL_USER
ENV MAIL_PASS
ENV MAIL_AUTH
ENV API_KEY
CMD ["java", "-jar", "/opt/app/app.jar"]