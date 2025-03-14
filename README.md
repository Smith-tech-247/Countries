# Countries App


                                        📌 Overview
The Country App is an Android application built using Jetpack Compose. It retrieves a list of countries from a network API, stores them in a local database, and displays them efficiently in a responsive UI. The app ensures a smooth user experience by handling errors gracefully and following best architectural practices.

                                        ✨ Features
🌍 Fetches country data from a remote API. 

📥 Stores data locally using Room Database.

🖥 Displays the list of countries in a Jetpack Compose UI. 

✅ Unit and UI tests to ensure correctness. 

⚡ Uses Dependency Injection (DI) for better maintainability.

🔄 Implements Repository Pattern to manage data sources efficiently.

                                        🏗 Architecture

The project follows the MVVM (Model-View-ViewModel) pattern along with the Repository pattern for data management.

com.example.walmartapp

│── apiservice            # API service interface for network calls

│── di                    # Dependency Injection (Hilt modules)

│── model                 # Data models representing country details

│── repository            # Data repositories for fetching and caching data

│── room                  # Local database (Room, DAO)

│── ui                    # Jetpack Compose UI components

│── viewmodel             # ViewModels handling business logic

│── androidTest/test       # Unit and UI tests


                                        🛠 Tools & Libraries
Tool/Library	Purpose

Kotlin	Main programming language

Jetpack Compose	Modern UI toolkit for Android

Retrofit	Handles network requests

Room Database	Local storage for offline support

Hilt	Dependency Injection framework

Coroutines	Asynchronous programming

JUnit & AndroidJUnit4	Unit & UI testing


                                        🏗 Project Setup

🔧 Prerequisites
Android Studio (Latest version)

Kotlin & Java installed

Emulator or Physical Device with API level 23+
               
🚀 Installation
Clone the repository:

git clone https://github.com/Smith-tech-247/Countries.git

Open the project in Android Studio.

Sync Gradle dependencies.

Run the app on an emulator or device.

                                         🔬 Testing
                                         
Run the test cases using: ./gradlew ./gradlew CountryDataLayoutKtTest.kt

note: Your terminal must be on java 11



