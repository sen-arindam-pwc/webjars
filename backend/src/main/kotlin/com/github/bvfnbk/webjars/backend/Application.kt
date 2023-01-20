package com.github.bvfnbk.webjars.backend

import com.github.bvfnbk.webjars.backend.framework.plugins.configureRouting
import com.github.bvfnbk.webjars.backend.framework.plugins.configureSerialization
import io.ktor.server.application.Application
import io.ktor.server.cio.CIO
import io.ktor.server.engine.embeddedServer

/**
 *
 */
fun main() {
    embeddedServer(
        CIO,
        port = 8080,
        host = "0.0.0.0",
        module = Application::module
    ).start(wait = true)
}

fun Application.module() {
    configureSerialization()
    configureRouting()
}
