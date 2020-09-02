# sorter

simple app in JAVA/Spring that has a /sort endpoint that accepts a JSON with a payload and sortkeys and returns the sorted payload.

### run
docker build --build-arg JAR_FILE=build/libs/sorter.jar -t springio/gs-spring-boot-docker .

### tests
./gradlew test
