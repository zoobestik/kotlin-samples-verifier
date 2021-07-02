plugins {
    kotlin("plugin.serialization") version "1.5.10"
    application
}

group = "com.kotlin.samples.pusher"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("com.samples.pusher.client.Client")
}

repositories {
    mavenCentral()
}

dependencies {
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")

    implementation("com.github.spullara.cli-parser:cli-parser:1.1.5")
    implementation("org.eclipse.mylyn.github:org.eclipse.egit.github.core:2.1.5")
    implementation("org.apache.commons:commons-configuration2:2.7")
    implementation("commons-beanutils:commons-beanutils:1.9.4")
    implementation("org.freemarker:freemarker:2.3.31")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.1")

    implementation(project(":kotlin-samples-verifier"))//implementation("io.github.alexanderprendota:kotlin-samples-verifier:1.1.4")
}

tasks.test {
    useJUnitPlatform()
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "11"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "11"
    }
}