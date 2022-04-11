FROM openjdk:11
COPY ./target/MiniProjectCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","MiniProjectCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar","Calculator.Calculator"]

