package com.github.bvfnbk.webjars.backend.framework.plugins

import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.webjars.Webjars

/**
 *
 */
fun Application.configureWebJars() {
    install(Webjars) {
        path = "assets"
    }
}
