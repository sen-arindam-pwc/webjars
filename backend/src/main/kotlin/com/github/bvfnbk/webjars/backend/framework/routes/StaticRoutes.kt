package com.github.bvfnbk.webjars.backend.framework.routes

import io.ktor.server.application.Application
import io.ktor.server.http.content.default
import io.ktor.server.http.content.files
import io.ktor.server.http.content.static
import io.ktor.server.http.content.staticRootFolder
import io.ktor.server.routing.routing
import mu.KotlinLogging
import java.io.File

/**
 *
 */
fun Application.staticRoutes() {
    val logger = KotlinLogging.logger { }

    val uiRootDirectory = System.getenv("UI_ROOT_DIRECTORY")
        ?: throw IllegalStateException("UI_ROOT_DIRECTORY wanted but not found.")

    logger.info { "Setting up static routes to serve $uiRootDirectory..." }

    routing {
        static("/") {
            staticRootFolder = File(uiRootDirectory)
            files(".")
            default("index.html")
        }
    }
}
