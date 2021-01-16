#FROM java:8
#MAINTAINER liuyue
#COPY app.jar /
#ENTRYPOINT ["java","-jar","app.jar"]
FROM java:8-jre
VOLUME /tmp
ADD *.jar app.jar
#默认的容器启动执行命令
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]