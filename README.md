Doctor Appointment Booking App
A Spring Boot application for managing appointments between clients and specialists — featuring scheduling, availability checks, and status tracking.

🩺 Overview
The Appointment Booking System is a web-based application that enables clients to easily schedule, manage, and track appointments with doctor specialists. It also allows specialists to manage treatment offerings and view their appointment history. The system ensures real-time availability validation and conflict detection.

✨ Features
👤 Client Features
Browse Available Treatments – Filter treatments by name or assigned specialist.

View Treatment Details – See treatment info and available specialists.

Book Appointments – Schedule new appointments with conflict validation.

Check Upcoming Appointments – List of scheduled visits.

Cancel Appointments – Cancel upcoming visits.

View Appointment History – List of completed and canceled appointments.

🧑‍⚕️ Specialist Features
Create Treatments – Add new treatments with details like name and duration.

Mark Appointments as Completed – Update appointment status after service.

View Appointment History – Access all past appointments.

⚠️ Conflict Detection
Schedule Validation – Prevent overlapping appointments during booking.

🛠️ Technologies Used
Spring Boot 3.4.4 – Application framework.

Spring Data JPA – Persistence layer.

H2 Database – In-memory database for development/testing.

Spring Web – Handles REST APIs and controllers.

Spring Boot Actuator – Health checks and monitoring.

Flyway – Database versioning and migrations.

Lombok – Reduces boilerplate Java code.

🚀 Project Setup
✅ Requirements
Java 21+

Maven 3.x

IntelliJ IDEA or another IDE

⚙️ Configuration
In application.properties:

properties
Copy
Edit
# H2 Database
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:appointmentbooking
spring.datasource.username=sa
spring.datasource.password=password

# Actuator
management.endpoint.health.show-components=always
management.endpoint.health.show-details=always
management.endpoints.web.exposure.include=*

# Flyway
spring.flyway.locations=classpath:db/migration
spring.flyway.enabled=true
spring.flyway.clean-on-validation-error=true
📦 Git Workflow & Release Strategy
📁 Branching Model
This project uses a simplified Git Flow strategy:

main: production-ready code

develop: integration of ongoing features

feature/*: feature development (e.g., feature/user-auth)

release/*: staging for release (e.g., release/1.0.0)

hotfix/*: urgent fixes on production

🚢 Releasing Process
bash
Copy
Edit
# 1. Merge features into develop
git checkout develop

# 2. Create a release branch
git checkout -b release/1.0.0

# 3. Finalize and test the release
# (make changes if needed)

# 4. Merge into main and tag the release
git checkout main
git merge release/1.0.0
git tag -a v1.0.0 -m "Release version 1.0.0"
git push origin v1.0.0

# 5. Merge back into develop
git checkout develop
git merge release/1.0.0
