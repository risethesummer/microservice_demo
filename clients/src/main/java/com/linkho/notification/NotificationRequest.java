package com.linkho.notification;

/**
 * notification
 * Created by NhatLinh - 19127652
 * Date 11/6/2022 - 9:16 PM
 * Description: ...
 */
public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerName,
        String message
) {
}
