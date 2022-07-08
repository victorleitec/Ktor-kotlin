package io.github.victorleitec.plugins

import io.github.victorleitec.routes.customerRouting
import io.github.victorleitec.routes.getOrderRoute
import io.github.victorleitec.routes.listOrdersRoute
import io.github.victorleitec.routes.totalizeOrderRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        customerRouting()
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}
