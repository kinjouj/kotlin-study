plugins {
    id("org.jetbrains.kotlin.jvm").version("2.1.21")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

application {
    mainClass = "Main"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
