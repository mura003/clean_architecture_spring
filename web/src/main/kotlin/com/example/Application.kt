package com.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@EnableConfigurationProperties
@ComponentScan(basePackages = ["com.example"])
class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
    Thread.currentThread().join()
}