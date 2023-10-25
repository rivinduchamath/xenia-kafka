
package com.cloudofgoods.cog.dataengineeringconsumer.components;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

    @Component
    public class KafkaTexasTopicListener {

        int i = 1;

        /** READ FROM TEXAS KAFKA TOPIC **/
        @KafkaListener(
                topics = "${spring.kafka.topic.texassales}",
                groupId = "groupOne" // Consumer Group 1
        )
        public void readTxSalesGroupOne(@Payload String record) {
            processAndPrint(record);
        }

        @KafkaListener(
                topics = "${spring.kafka.topic.texassales}",
                groupId = "groupTwo" // Consumer Group 2
        )
        public void readTxSalesGroupTwo(@Payload String record) {
            processAndPrint(record);
        }

        // Add more @KafkaListener methods for additional consumer groups if needed

        private void processAndPrint(String record) {
            if (record != null && record.length() > 0) {
                try {
                    // DO ADDITIONAL PROCESSING WITH THIS FILTERED STREAM OF TEXAS SALES. FOR NOW JUST PRINTING IT OUT
                    System.out.println("TEXAS TOPIC " + i + " => " + record);
                    i++;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }