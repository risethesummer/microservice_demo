package com.linkho.notification;

import org.linkho.amqp.RabbitMQMessageProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * notification
 * Created by NhatLinh - 19127652
 * Date 11/6/2022 - 9:04 PM
 * Description: ...
 */
@SpringBootApplication(
        scanBasePackages = {
                "com.linkho.notification",
                "org.linkho.amqp"
        }
)
public class NotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

//        @Bean
//        CommandLineRunner commandLineRunner(
//                RabbitMQMessageProducer producer,
//                NotificationConfig notificationConfig) {
//            return args -> {
//                producer.publish(
//                        notificationConfig.getInternalExchange(),
//                        notificationConfig.getInternalNotificationRoutingKey(),
//                        new Person("Link", 22));
//            };
//        }
//
//        private record Person(String name, int age){}
}
