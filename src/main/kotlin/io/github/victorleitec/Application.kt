package io.github.victorleitec

import io.github.victorleitec.plugins.configureRouting
import io.github.victorleitec.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureRouting()
    configureSerialization()
}
