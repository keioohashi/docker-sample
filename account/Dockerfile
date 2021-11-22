FROM openjdk:11-jdk-slim
ADD target/account-*.jar account.jar

ENTRYPOINT ["java", "-jar", "/account.jar", "${OPTS_ARGS}"]