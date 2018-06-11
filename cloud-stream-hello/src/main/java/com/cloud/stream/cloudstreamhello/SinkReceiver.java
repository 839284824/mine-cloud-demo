package com.cloud.stream.cloudstreamhello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author gongzhao
 * 用于接收来自RabbitMQ消息的消费者
 */
@EnableBinding(Sink.class)
@Slf4j
public class SinkReceiver {


    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        log.info("Received: " + payload);
    }

}