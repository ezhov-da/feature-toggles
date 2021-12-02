package ru.ezhov.featuretoggles

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FeatureTogglesServerApplication

fun main(args: Array<String>) {
    runApplication<FeatureTogglesServerApplication>(*args)
}
