plugins {
    kotlin("multiplatform") version "1.5.10"
    kotlin("native.cocoapods") version "1.5.10"
}

group = "org.jetbrains.kotlin.sample"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    jcenter()
    maven { setUrl("https://dl.bintray.com/kotlin/kotlinx.html/") }
}

kotlin {
    ios()

    cocoapods {
        summary = "Kotlin sample project with CocoaPods dependencies"
        homepage = "https://github.com/Baileypollard/kotlin-mp-cocoapods-sample"

        ios.deploymentTarget = "13.5"

//      Example of usage remote Cocoapods dependency from Cocoapods repository
        pod("AFNetworking", "~> 4.0.1")

//      uncomment this next line to see StarIO is not importing with "module 'StarIO' not found"
//      pod("StarIO", "~> 2.8.2")
    }
}