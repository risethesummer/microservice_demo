package com.linkho.notification.rabbitmq;

import com.linkho.notification.NotificationRequest;
import com.linkho.notification.NotificationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * com.linkho.notification.rabbitmq
 * Created by NhatLinh - 19127652
 * Date 11/12/2022 - 11:25 PM
 * Description: ...
 */
@Component
@Slf4j
@AllArgsConstructor
public class NotificationConsumer {
    private final NotificationService notificationService;

    @RabbitListener(queues = "${rabbitmq.queues.notification}")
    public void consumer(NotificationRequest notificationRequest)
    {
        log.info("Consumed {} from queue", notificationRequest);
        notificationService.sendNotification(notificationRequest);
    }
}
