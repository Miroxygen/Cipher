# Encryption Application

A simple encryption and decryption application built using Java. This application allows users to choose between substitution and transposition ciphers to encrypt or decrypt text files.

## Core Functionalities

  -  File Reading: Reads the content of a specified file.
  -  Encryption/Decryption: Allows users to choose between substitution and transposition ciphers for encrypting and decrypting files.
  -  Console Interaction: Interacts with the user through the console to get inputs and display messages.

### Technologies Used

-    Java: Main programming language for the application.
-    Scanner: For reading user input from the console.
-    File: For reading files from the filesystem.

## Project Structure

 1. Controller
     -   App.java: Main entry point of the application. Initializes the components and starts the encryption/decryption process.
     -   Creator.java: Handles the creation of ciphers and the overall workflow of encryption and decryption.
 3. Model
     -   Chiffer.java: Interface for the encryption ciphers.
     -   Filereader.java: Reads the content of a specified file.
     -   SubstitutionChiffer.java: Implements the substitution cipher.
     -   TransPositionChiffer.java: Implements the transposition cipher.
  4. View
     -   Console.java: Interacts with the user through the console, getting inputs and displaying messages.

## Setup

  1. Clone the repository.

2. Build the project using Gradle: 
    - ./gradlew build

3. Run the application:
    - ./gradlew run

## Usage

   1. Run the application.
  2.  Follow the console prompts to choose the type of cipher (substitution or transposition).
   3. Enter the file name of the text file you wish to encrypt or decrypt.
   4. Enter the key for encryption or decryption.
  5.  Choose whether to encrypt or decrypt the file.
  6.  The application will display messages indicating the progress of the operation.

## Dependencies

   Java 8 or higher: Ensure you have Java installed on your system.

## License

This project is licensed under the MIT License.
