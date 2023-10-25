package com.cloudofgoods.cog.domainprocessor.configuration;

import com.cloudofgoods.cog.domainprocessor.model.Domain;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Slf4j
@Configuration
public class ProcessesConfiguration {
    @Bean
    public Function<KStream<String, Domain>, KStream<String, Domain>> domainProcessor() {

        return kstream -> kstream.filter((key, domain) -> {
            if (domain.isDead()) {
               log.info("Inactive Domain: " + domain.getDomain());
            } else {
                log.info("Active Domain: " + domain.getDomain());
            }
            return !domain.isDead();
        });

    }
}