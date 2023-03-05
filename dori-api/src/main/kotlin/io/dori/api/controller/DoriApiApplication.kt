package io.dori.api.controller

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DoriApiApplication

fun main(args: Array<String>) {
    runApplication<DoriApiApplication>(*args)
}
