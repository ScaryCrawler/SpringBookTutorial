plugins {
    java
    application
}

group = "com.ilay"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile("org.springframework:spring-core:5.1.6.RELEASE")
    compile("org.springframework:spring-context:5.1.6.RELEASE")

    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

application {
    mainClassName = "App"
}