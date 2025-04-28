# Software Testing and Quality Assurance Portfolio

## Overview

This repository showcases my expertise in software testing, automation, and quality assurance through deliverables from two coursework projects. The included files demonstrate my ability to design and implement software, create comprehensive unit tests to uncover errors, analyze testing approaches based on requirements, and apply effective testing strategies to ensure quality. The repository contains:

- **Project One**: Contact service files (`Contact.java`, `ContactService.java`, `ContactTest.java`, `ContactServiceTest.java`), implementing a contact management system with thorough unit tests.
- **Project Two**: A summary and reflections report (`Project_2.docx`), detailing the unit testing approach for Contact, Task, and Appointment services in a mobile application, along with reflections on testing strategies and outcomes.

These artifacts highlight my skills in Java programming, JUnit testing, and critical analysis of software development processes, showcasing a commitment to building reliable and robust software.

## Project Descriptions

### Project One: Contact Management System

The contact service files implement a contact management system in Java, designed to create, update, and delete contacts with strict validation rules. Key components include:

- **Contact.java**: Defines the `Contact` class with an immutable contact ID and validated fields (e.g., 10-digit phone numbers, 10-character name limits), ensuring data integrity.
- **ContactService.java**: Manages a collection of contacts, providing methods for adding, deleting, and updating contacts, with checks for duplicate IDs and non-existent contacts.
- **ContactTest.java**: Contains JUnit tests to verify `Contact` class constraints, such as `testInvalidPhone`, which ensures phone numbers are exactly 10 digits.
- **ContactServiceTest.java**: Includes JUnit tests to validate `ContactService` functionality, covering scenarios like adding duplicate IDs (`testAddDuplicateContactId`) and updating contacts (`testUpdateContact`).

These files demonstrate my ability to write automated tests that uncover errors and ensure the system meets functional requirements.

### Project Two: Summary and Reflections Report

The summary and reflections report from Project Two details the unit testing approach for a mobile application’s Contact, Task, and Appointment services. Using JUnit, I tested each service independently to meet requirements, such as unique IDs, field length constraints, and valid date checks. For example, `TaskTest.java` includes `testNameTooLong` to enforce a 20-character limit on task names, while `AppointmentTest.java` uses `testPastDate` to prevent past appointment dates. The report evaluates test coverage (exceeding 80%, likely 100%), discusses challenges in anticipating edge cases, and reflects on testing techniques like boundary value analysis. This artifact showcases my ability to align tests with requirements, assess test quality, and articulate lessons learned.

## Reflections

### How can I ensure that my code, program, or software is functional and secure?

I use thorough unit testing, as seen in `ContactTest.java` and `TaskServiceTest.java`, to validate functionality and edge cases like null inputs. Security is ensured through input validation (e.g., regex for phone numbers in `Contact.java`) and advocating for code reviews to catch vulnerabilities.

### How do I interpret user needs and incorporate them into a program?

I translate requirements into testable specifications, like `testNullContactId` and `testPastDate` in Project Two, ensuring reliability. Engaging stakeholders and iterative testing refine the software to meet user expectations.

### How do I approach designing software?

I design modular, testable software, using encapsulation in `Contact.java` and scalable structures like `ArrayList` in `ContactService.java`. Boundary value analysis and continuous testing, as in `TaskTest.java`, ensure robust, extensible code.

## Conclusion

This portfolio reflects my proficiency in Java development, unit testing with JUnit, and software quality assurance. The contact service files from Project One demonstrate technical implementation and rigorous testing, while the summary and reflections report from Project Two highlights my ability to critically evaluate testing strategies and learn from challenges. Together, these artifacts showcase a disciplined approach to building functional, secure, and user-focused software, with a strong foundation in testing and quality assurance.
