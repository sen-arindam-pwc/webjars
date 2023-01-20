package com.github.bvfnbk.webjars.backend.framework.routes

import com.github.bvfnbk.webjars.backend.model.Greeting
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.get
import io.ktor.server.routing.routing
import mu.KotlinLogging

private val DEFAULT_NAME = "Anonymous"

/**
 *
 */
fun Application.greetingRoutes() {
    val logger = KotlinLogging.logger {  }

    routing {
        get("/api/greeting") {
            logger.info { "GET /api/greeting" }

            val name = call.request.queryParameters["name"] ?: DEFAULT_NAME

            if (name == DEFAULT_NAME) {
                logger.info { "Received default name." }
            } else {
                logger.info { "Received name: $name"}
            }

            call.respond(Greeting("Hello there, $name"))
        }
    }
}
