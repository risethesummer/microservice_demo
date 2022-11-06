package com.linkho.clients.notification;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * notification
 * Created by NhatLinh - 19127652
 * Date 11/6/2022 - 9:13 PM
 * Description: ...
 */
@AllArgsConstructor
@Service
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository notificationRepository;
    @Override
    public void sendNotification(NotificationRequest request) {
        notificationRepository.save(
                Notification.builder()
                        .customerId(request.toCustomerId())
                        .toCustomerEmail(request.toCustomerName())
                        .sender("Linkho")
                        .message(request.message())
                        .createdAt(LocalDateTime.now())
                        .build()
        );
    }
}
