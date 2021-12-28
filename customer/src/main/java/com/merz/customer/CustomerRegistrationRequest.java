package com.merz.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
