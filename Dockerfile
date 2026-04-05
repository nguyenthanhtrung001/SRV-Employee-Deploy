# ========================
# Stage 1: Build
# ========================
FROM maven:3.9.2-eclipse-temurin-21 AS build
WORKDIR /app

# Sao chép file pom.xml trước để cache dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Sao chép toàn bộ mã nguồn
COPY src ./src

# Build ứng dụng và bỏ qua test
RUN mvn clean package -DskipTests

# Kiểm tra file target
RUN ls -la target

# ========================
# Stage 2: Run
# ========================
FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app

# Copy file jar từ stage build
COPY --from=build /app/target/employee-service-0.0.1-SNAPSHOT.jar app.jar

# Mở cổng 8080
EXPOSE 8080

# Khởi chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]