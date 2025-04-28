Software Testing and Quality Assurance Portfolio

Overview

This repository showcases my expertise in software testing, automation, and quality assurance through deliverables from two coursework projects. The included files demonstrate my ability to design and implement software, create comprehensive unit tests to uncover errors, analyze testing approaches based on requirements, and apply effective testing strategies to ensure quality. The repository contains:





Project One: Contact service files (Contact.java, ContactService.java, ContactTest.java, ContactServiceTest.java), implementing a contact management system with thorough unit tests.



Project Two: A summary and reflections report, detailing the unit testing approach for Contact, Task, and Appointment services in a mobile application, along with reflections on testing strategies and outcomes.

These artifacts highlight my skills in Java programming, JUnit testing, and critical analysis of software development processes, showcasing a commitment to building reliable and robust software.

Project Descriptions

Project One: Contact Management System

The contact service files implement a contact management system in Java, designed to create, update, and delete contacts with strict validation rules. Key components include:





Contact.java: Defines the Contact class with an immutable contact ID and validated fields (e.g., 10-digit phone numbers, 10-character name limits), ensuring data integrity.



ContactService.java: Manages a collection of contacts, providing methods for adding, deleting, and updating contacts, with checks for duplicate IDs and non-existent contacts.



ContactTest.java: Contains JUnit tests to verify Contact class constraints, such as testInvalidPhone, which ensures phone numbers are exactly 10 digits.



ContactServiceTest.java: Includes JUnit tests to validate ContactService functionality, covering scenarios like adding duplicate IDs (testAddDuplicateContactId) and updating contacts (testUpdateContact).

These files demonstrate my ability to write automated tests that uncover errors and ensure the system meets functional requirements.

Project Two: Summary and Reflections Report

The summary and reflections report from Project Two details the unit testing approach for a mobile application’s Contact, Task, and Appointment services. Using JUnit, I tested each service independently to meet requirements, such as unique IDs, field length constraints, and valid date checks. For example, TaskTest.java includes testNameTooLong to enforce a 20-character limit on task names, while AppointmentTest.java uses testPastDate to prevent past appointment dates. The report evaluates test coverage (exceeding 80%, likely 100%), discusses challenges in anticipating edge cases, and reflects on testing techniques like boundary value analysis. This artifact showcases my ability to align tests with requirements, assess test quality, and articulate lessons learned.

Reflections

How can I ensure that my code, program, or software is functional and secure?

To ensure functionality and security, I rely on comprehensive unit testing and secure coding practices. In Project One, ContactTest.java and ContactServiceTest.java validated all methods and edge cases, such as null inputs and invalid phone numbers, ensuring robust functionality. For the Task and Appointment services in Project Two, tests like testAddDuplicateTaskId and testPastDate enforced unique IDs and valid dates, aligning with requirements. Security is addressed through input validation, such as regex checks in Contact.java for 10-digit phone numbers, preventing malformed inputs that could lead to vulnerabilities. I also advocate for code reviews and static analysis tools to catch potential security issues, ensuring technically sound code.

How do I interpret user needs and incorporate them into a program?

Interpreting user needs involves translating requirements into testable specifications. In Project Two, I mapped requirements like "unique contact IDs" and "no past appointment dates" to specific tests, such as testNullContactId in ContactTest.java and testPastDate in AppointmentTest.java. This ensured the software met user expectations for reliability and correctness. I engage with stakeholders to clarify ambiguous requirements and prioritize usability, as seen in the Contact service’s strict field validations, which prevent user errors. Iterative testing and feedback loops further refine the program to align with user needs, ensuring a user-centric design.

How do I approach designing software?

My software design approach is requirements-driven, modular, and test-focused. In Project One, I designed the Contact class with encapsulation and immutability (e.g., final contact ID) to ensure maintainability and integrity. The ContactService class uses an ArrayList for scalable contact management, with methods designed for testability, as validated in ContactServiceTest.java. In Project Two, I applied similar principles to the Task and Appointment services, using boundary value analysis to test edge cases like maximum field lengths. I prioritize simplicity, writing efficient methods like the linear search in TaskService.java’s findTask, and plan for extensibility to accommodate future requirements. Continuous testing throughout development ensures the design remains robust and aligned with goals.

Conclusion

This portfolio reflects my proficiency in Java development, unit testing with JUnit, and software quality assurance. The contact service files from Project One demonstrate technical implementation and rigorous testing, while the summary and reflections report from Project Two highlights my ability to critically evaluate testing strategies and learn from challenges. Together, these artifacts showcase a disciplined approach to building functional, secure, and user-focused software, with a strong foundation in testing and quality assurance.
