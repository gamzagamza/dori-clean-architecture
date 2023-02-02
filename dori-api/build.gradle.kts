dependencies {
    implementation(project(":dori-domain"))
    implementation(project(":dori-shared"))

    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-validation")

    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("io.micrometer:micrometer-registry-prometheus:1.9.2")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
