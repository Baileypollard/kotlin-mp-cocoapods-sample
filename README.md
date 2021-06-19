# Kotlin with Cocoapods example

The purpose of this repo is to provide a barebones project to replicate the issues importing the StarIO/StarIO_Extension pods. It appears that these projects have issues importing as they constantly return "Module not found" error.

## Instructions

1. Start off by cloning the repository, and opening the project in your IDE of choice. I use IntelliJ  in which you can import the project through its `build.gradle.kts` file. Wait for the gradle build to finish before moving on to step 2.

2. As per [this](https://kotlinlang.org/docs/native-cocoapods.html) article run `sudo gem install cocoapods` and then `sudo gem install cocoapods-generate`. Wait for the installation to finish

3. `Cd kotlin-mp-cocoapods-sample/kotlin-library`, and run `pod gen` this will generate a `gen` directory. This is where you will be calling "pod install" when you add/remove a new pod dependancy from the `build.gradle.kts` file.

4. `cd gen/kotlin-library` and execute `pod install`, wait for the pods to install

5. Once pods are installed, open the `kotlin_library.xcworkspace` file and try and build. You will most likely get a "StarIO module not found error". This error will also happen if you try and execute a gradle build.

6. In order to get a successful 
