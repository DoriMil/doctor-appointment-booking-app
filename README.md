# doctor-appointment-booking-app
A Spring Boot application for managing appointments between clients and specialists – featuring scheduling, availability checks, and status tracking.

# Appointment Booking System

## Overview

The Appointment Booking System is a web-based application designed to facilitate the scheduling of appointments between clients and doctor specialists. It aims to offer an efficient platform for clients to book, cancel, and track appointments, while allowing specialists to manage their schedules. The system ensures real-time availability validation, conflict checking, and appointment status tracking.

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
- **H2 Database**: In-memory database for quick testing and development.
- **Spring Web**: To handle web-related functionalities (HTTP requests, controllers).
- **Spring Boot Actuator**: For monitoring the application health and exposing system information.
- **Flyway**: For database migrations.
- **Lombok**: To reduce boilerplate code.

## Project Setup

### Requirements
- Java 21 or higher
- Maven 3.x
- IntelliJ IDEA or other preferred IDE

### Configuration

In the `application.properties` file add the following configurations:

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


### Release Workflow & Git Practices

## Branching Model
This project follows a simplified Git Flow branching strategy:

- **main**: contains production-ready code.
- **develop**: integration branch for features under development.
- **feature/***: feature-specific branches (e.g., feature/user-authentication).
- **release/***: preparation for a production release (e.g., release/1.0.0).
- **hotfix/***: urgent fixes applied directly to production code.

## Releasing Process
1. Merge finished features into the develop branch.
2. Create a release branch:

git checkout develop
git checkout -b release/1.0.0

3. Test and finalize the release.

4. Merge into main and tag the version:

git checkout main
git merge release/1.0.0
git tag -a v1.0.0 -m "Release version 1.0.0"
git push origin v1.0.0

5. Merge the release branch back into develop to keep it up to date:

git checkout develop
git merge release/1.0.0

### Automated Release Pipeline
This project uses GitHub Actions to automate build verification when a version tag is pushed.

## Trigger
The workflow is triggered on tags matching v*.*.*, for example:

git tag -a v1.0.0 -m "Release version 1.0.0"
git push origin v1.0.0

## Workflow File
Location: .github/workflows/release.yml
📦 This ensures all production releases are tested and verified before deployment.
