//package com.cloudofgoods.cog.dataengineeringconsumer.configuration;
//
//import com.cloudofgoods.cog.dataengineeringconsumer.model.Domain;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.kafka.streams.kstream.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.function.Consumer;
//
//@Slf4j
//@Configuration
//public class DomainKafkaConsumer {
//
//    @Bean
//    public Consumer<KStream<String, String>> domainService() {
//        return kstream -> kstream.foreach((key, domain) -> {
//           log.info(String.format("Domain consumed[%s] ", domain.toString()));
//        });
//    }
//}