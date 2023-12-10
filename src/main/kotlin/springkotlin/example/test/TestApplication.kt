package springkotlin.example.test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties:: class)
class TestApplication

fun main(args: Array<String>) {
	runApplication<TestApplication>(*args)
	println("#####################")
}
