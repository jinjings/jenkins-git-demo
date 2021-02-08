FROM java:8
VOLUME /tmp
ADD jenkins-git-demo.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 9004
#ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

