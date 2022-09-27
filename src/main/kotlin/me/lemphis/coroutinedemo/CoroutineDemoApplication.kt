package me.lemphis.coroutinedemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CoroutineDemoApplication

fun main(args: Array<String>) {
	runApplication<CoroutineDemoApplication>(*args)
}
