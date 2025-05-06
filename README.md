# doctor-appointment-booking-app
A Spring Boot application for managing appointments between clients and specialists – featuring scheduling, availability checks, and status tracking.




# doctor-appointment-booking-app
A Spring Boot application for managing appointments between clients and specialists – featuring scheduling, availability checks, and status tracking.

# Appointment Booking System

## Overview

The Appointment Booking System is a web-based application designed to facilitate the scheduling of appointments between clients and specialists. It aims to offer an efficient platform for clients to book, cancel, and track appointments, while allowing specialists to manage their schedules. The system ensures real-time availability validation, conflict checking, and appointment status tracking.

## Features

### Client Features:
- **Browse Available Treatments**: Retrieve a list of available treatments, optionally filtered by specialist or treatment name.
- **View Treatment Details**: Access detailed information about a specific treatment, including assigned specialists.
- **Book an Appointment**: Select a treatment and schedule an appointment, with real-time validation for availability.
- **Check Scheduled Appointments**: View a list of upcoming appointments.
- **Cancel Appointments**: Cancel previously scheduled appointments.
- **View Appointment History**: Access a list of completed and canceled appointments.

### Specialist Features:
- **Create New Treatments**: Specialists can add new treatments with details such as treatment name and duration.
- **Mark Appointments as Completed**: After service provision, specialists can mark appointments as completed.
- **View Appointment History**: Specialists can access their past appointments.

### Conflict Detection:
- **Schedule Validation**: The system ensures that no appointments overlap by checking for scheduling conflicts before booking.

## Technologies Used

- **Spring Boot 3.4.4**: Framework for building the application.
- **Spring Data JPA**: For database interaction and persistence.
- **H2 Database**: In-memory database used for quick testing and development.
- **Spring Web**: To handle web-related functionalities (HTTP requests, controllers).
- **Spring Boot Actuator**: For monitoring the application health and exposing system information.
- **Flyway**: For database migrations.
- **Lombok**: To reduce boilerplate code.

## Project Setup

### Requirements
- Java 21 or higher
- Maven 3.x
- IntelliJ IDEA or your preferred IDE

### Step-by-Step Guide to Run the Application

1. **Generate the Project**:
   - Go to [Spring Initializr](https://start.spring.io/).
   - Choose the following settings:
     - **Project**: Maven Project
     - **Language**: Java
     - **Spring Boot**: 3.4.4
     - **Group**: com.capgemini.training
     - **Artifact**: appointment-booking-app
     - **Package Name**: com.capgemini.training.appointmentbooking
     - **Packaging**: Jar
     - **Java Version**: Select JDK 21

2. **Add Dependencies**:
   - Spring Web
   - Lombok
   - H2 Database
   - Spring Data JPA
   - Spring Boot Actuator
   - Flyway Migration

3. **Unzip the project** in a convenient directory (e.g., `C:\trainings\java-backend-developer`).

4. **Import the Project** into your IDE (e.g., IntelliJ IDEA).

5. **Build the Project** using Maven in your IDE.

### Configuration

In the `application.properties` file, make sure to add the following configurations:

```properties
# H2 Database configuration
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:appointmentbooking
spring.datasource.username=sa
spring.datasource.password=password

# Actuator endpoints for health check
management.endpoint.health.show-components=always
management.endpoint.health.show-details=always
management.endpoints.web.exposure.include=*

# Flyway Database Migration
spring.flyway.locations=classpath:db/migration
spring.flyway.enabled=true
spring.flyway.clean-on-validation-error=true

