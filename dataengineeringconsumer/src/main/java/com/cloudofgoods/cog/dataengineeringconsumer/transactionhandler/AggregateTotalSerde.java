package com.cloudofgoods.cog.dataengineeringconsumer.transactionhandler;


import com.cloudofgoods.cog.dataengineeringconsumer.model.AggregateTotal;
import org.apache.kafka.common.serialization.Serdes;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;

public class AggregateTotalSerde extends Serdes.WrapperSerde<AggregateTotal> {

    public AggregateTotalSerde() {
        super(new JsonSerializer<>(), new JsonDeserializer<>(AggregateTotal.class));
    }
}