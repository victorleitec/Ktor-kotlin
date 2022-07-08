package io.github.victorleitec.dto

import io.github.victorleitec.models.Customer
import kotlinx.serialization.Serializable
import java.util.UUID

@Serializable
class CustomerDto(val firstName: String, val lastName: String, val email: String) {
    fun toCustomer(): Customer {
        return Customer(UUID.randomUUID().toString(), firstName, lastName, email)
    }
}