package com.abhijit.aiservice.service;

import com.abhijit.aiservice.model.Activity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ActivityMessageListener {

    @RabbitListener(queues = "activity.queue")
    public void processActivity(Activity activity) {
        log.info("Received Activity message from RabbitMQ: {}", activity.getId());
    }
}
