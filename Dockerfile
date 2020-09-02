FROM openjdk:8
EXPOSE 8080
ADD classes/artifacts/sorter_jar/sorter.jar sorter.jar
ENTRYPOINT ["java","-jar","/sorter.jar"]