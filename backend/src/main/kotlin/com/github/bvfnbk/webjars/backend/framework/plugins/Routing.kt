package com.github.bvfnbk.webjars.backend.framework.plugins

import com.github.bvfnbk.webjars.backend.framework.routes.greetingRoutes
import io.ktor.server.application.Application
import com.github.bvfnbk.webjars.backend.framework.routes.staticRoutes

fun Application.configureRouting() {
    staticRoutes()
    greetingRoutes()
}
