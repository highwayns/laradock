FROM hseeberger/scala-sbt:8u222_1.3.5_2.13.1
# openjdk:8-jdk-alpine

WORKDIR /usr/src/app/springboot

RUN sh -c 'echo "deb http://apt.postgresql.org/pub/repos/apt $(lsb_release -cs)-pgdg main" > /etc/apt/sources.list.d/pgdg.list'
RUN wget --quiet -O - https://www.postgresql.org/media/keys/ACCC4CF8.asc | apt-key add -
RUN apt update
RUN apt install postgresql-server-dev-12 gradle

EXPOSE 8080
EXPOSE 8090