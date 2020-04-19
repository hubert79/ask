package hubert.ask

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AskApplication

fun main(args: Array<String>) {
	runApplication<AskApplication>(*args)
}
