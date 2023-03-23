
# Stage 1: Build the project
FROM openjdk:11 as build

# Set the working directory
WORKDIR /app

# Copy the project files
COPY src ./src

# Copy the dependencies
COPY junit-jupiter-api-5.8.1.jar .
COPY junit-jupiter-engine-5.8.1.jar .
COPY junit-platform-commons-1.8.1.jar .
COPY junit-platform-engine-1.8.1.jar .

# Compile the project
RUN javac -cp .:junit-jupiter-api-5.8.1.jar:junit-jupiter-engine-5.8.1.jar:junit-platform-commons-1.8.1.jar:junit-platform-engine-1.8.1.jar src/main/java/GenerateAutoTests.java

# Stage 2: Run the project
FROM openjdk:11-jre-slim

# Set the working directory
WORKDIR /app

# Copy the compiled classes and dependencies from the build stage
COPY --from=build /app/src/main/java/GenerateAutoTests.class .
COPY --from=build /app/junit-jupiter-api-5.8.1.jar .
COPY --from=build /app/junit-jupiter-engine-5.8.1.jar .
COPY --from=build /app/junit-platform-commons-1.8.1.jar .
COPY --from=build /app/junit-platform-engine-1.8.1.jar .

# Run the project
CMD ["java", "-cp", ".:junit-jupiter-api-5.8.1.jar:junit-jupiter-engine-5.8.1.jar:junit-platform-commons-1.8.1.jar:junit-platform-engine-1.8.1.jar", "GenerateAutoTests"]
