# Exact Change Program

This is a Java program that calculates the least amount of change in US currency for a given amount of money. It uses Maven for dependency management (JUnit) and Docker for containerization (easy for someone to compile and run w/out Java or Maven).

## Author

[**Jon Purvis**](https://github.com/Jon-Purvis)

## Project Structure

- `src/main/java/com/jonpurvis`: Contains the main source code of the application.
- `src/test/java/com/jonpurvis`: Contains the unit tests for the application.
- `target/classes/com/jonpurvis`: Contains the compiled `.class` files after running Maven.
- `Dockerfile`: Provides a simple way to set up the environment and run the program in a container.
- `pom.xml`: The configuration file that Maven uses to manage project dependencies

## Option 1: Running with Docker

If you have Docker installed, you can use the Docker container to build and run the project without needing to install Java or Maven locally.

### Steps to Run with Docker:

1. Ensure that you have Docker installed. You can download it from [Docker's website](https://www.docker.com/get-started) if you don't already have it.

2. Clone this repository to your local machine:

   ```
   git clone https://github.com/Jon-Purvis/exact-change.git
   ```
   ```
   cd exact-change
   ```

3. Build and run the application using Docker:
   ```
   docker build -t exact-change .
   ```
   ```
   docker run -it exact-change
   ```

   This will:
   - Build the Docker image with the `exact-change` tag.
   - Run the image, which will install Java and Maven, perform a Maven clean install, and execute the program.

4. The application will then prompt you for an amount of money (up to two decimal places) and provide the exact change in US currency.
5. If instead you would like to run the JUnit tests then after building, run:
    ```
    docker run -it exact-change mvn test
    ```

---

## Option 2: Running with Java and Maven (Without Docker)

If you prefer to run the application using Java and Maven directly on your local machine, you can follow these steps.

### Prerequisites:

- **Java**: Make sure you have Java 17 or later installed. You can verify this by running:

   ```
   java -version
   ```

   If Java is not installed, you can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or install it through a package manager for your operating system.

- **Maven**: Make sure Maven is installed. You can verify this by running:

   ```
   mvn -version
   ```

   If Maven is not installed, you can follow the installation instructions from [Maven's website](https://maven.apache.org/install.html).
   
---

## Steps to Run with Java and Maven:

1. Clone the repository to your local machine:

   ```
   git clone https://github.com/Jon-Purvis/exact-change.git
   ```
   ```
   cd exact-change
   ```

2. Open the Project in your IDE of choice (w/ Maven plugin):

3. Run the application as described by your IDE's Maven plugin:

4. The application will then prompt you for an amount of money (up to two decimal places) and provide the exact change in US currency.

---

## Automated Tests

The project includes automated tests written using JUnit to verify the functionality of the change calculation.

---

## Conclusion

You can choose either to use Docker to quickly set up the environment or run the project manually using Java and Maven. If you're comfortable with Docker, the containerized version simplifies the setup process, but if you prefer working with Java and Maven directly, that option is available as well.
