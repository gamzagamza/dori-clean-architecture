apply(plugin = "org.jetbrains.kotlin.plugin.jpa")

dependencies {
    implementation(project(":domain"))
    implementation(project(":shared"))

    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("com.querydsl:querydsl-jpa")

    runtimeOnly("com.h2database:h2")

    kapt(group = "com.querydsl", name = "querydsl-apt", classifier = "jpa")
}
