Alertify
Alertify is a Spring Boot-based notification service that enables sending alerts via email and SMS. It supports user subscriptions, JWT authentication, and retry mechanisms for failed messages.

Features
JWT Authentication for secure access.
Email Notifications using JavaMail API.
SMS Alerts via Twilio.
User Subscription Management with MySQL.
Retry Mechanism for failed alerts.
Swagger UI for API documentation.
Tech Stack
Spring Boot, Spring Security, JavaMail API, Twilio, MySQL, Swagger UI, Maven
Setup
Clone the repo:
bash
Copy
Edit
git clone https://github.com/rbhatia2502/Alertify.git && cd Alertify
Configure Database & Credentials in application.properties.
Run the app:
bash
Copy
Edit
./mvnw spring-boot:run
