plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:33.7.1-jre")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.10.2")
}

tasks.test {
    useJUnitPlatform()
}
