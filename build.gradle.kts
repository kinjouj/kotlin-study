plugins {
    kotlin("jvm") version "2.1.21"
    //id("org.jetbrains.kotlin.jvm").version("2.1.21")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test:2.1.20")
}

application {
    mainClass = "Main"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
