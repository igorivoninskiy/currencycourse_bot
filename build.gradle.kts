import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    application
    kotlin("jvm") version "1.6.10"
    kotlin("plugin.serialization") version "1.6.10"
    id("com.github.johnrengelman.shadow") version "6.1.0"
}

group = "com.abuhrov"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("org.telegram:telegrambots:6.0.1")
    implementation(kotlin("stdlib-jdk8"))
}

application {
    mainClassName = "MainKt"
}

tasks {
    withType<Jar> {
        manifest { attributes(mapOf("Main-Class" to application.mainClassName)) }
    }
    register("stage") {
        dependsOn("build")
    }
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}