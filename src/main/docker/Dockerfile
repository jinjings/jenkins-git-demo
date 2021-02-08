FROM java:8
VOLUME /tmp
ADD jenkins-git-demo.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 9004
#ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]
ENTRYPOINT ["sh","-c","java -jar /app.jar"]

