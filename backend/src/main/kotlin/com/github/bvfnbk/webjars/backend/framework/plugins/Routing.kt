package com.github.bvfnbk.webjars.backend.framework.plugins

import com.github.bvfnbk.webjars.backend.framework.routes.greetingRoutes
import io.ktor.server.application.Application

fun Application.configureRouting() {
    // Uncomment the following line to use the environment variable:
    // staticRoutes()
    greetingRoutes()
}
