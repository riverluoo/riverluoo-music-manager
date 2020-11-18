FROM java:8-jre
RUN mkdir -p /application/target && ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone
WORKDIR /application
COPY target /application/target
EXPOSE 8089
ENTRYPOINT ["java" ,"-jar", "/application/target/music-manager-1.0.jar"]
