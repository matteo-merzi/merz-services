package com.merz.clients.notification;

public record NotificationRequest(Integer customerId, String customerEmail, String message) {
}
