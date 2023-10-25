package com.cloudofgoods.cog.dataengineeringconsumer.components;

import com.cloudofgoods.cog.dataengineeringconsumer.transactionhandler.AggregateTotalSerde;
import com.cloudofgoods.cog.dataengineeringconsumer.model.AggregateTotal;
import com.cloudofgoods.cog.dataengineeringconsumer.model.DataModel;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.KGroupedStream;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KTable;
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.state.KeyValueBytesStoreSupplier;
import org.apache.kafka.streams.state.Stores;
import org.springframework.stereotype.Component;


@Component
public class KTableProcessor {

    //KTABLE STATE: Create a KTable for State of sales per dealer
    public void process(KStream<String, DataModel> stream){

        //Create a new KeyValue Store
        KeyValueBytesStoreSupplier dealerSales = Stores.persistentKeyValueStore(
                "dealer-sales-amount");

//        KGroupedStream<String, Double> salesByDealerId = stream
//                .map((key, sales) -> new KeyValue(sales.getDealerId(), Double.parseDouble(sales.getPrice())))
//                .groupByKey();

//        KTable<String, AggregateTotal> dealerAggregate = salesByDealerId.aggregate(() -> new AggregateTotal(),
//                (k,v,aggregate) -> {
//                    aggregate.setCount(aggregate.getCount()+1);
//                    aggregate.setAmount(aggregate.getAmount()+v);
//                    return aggregate;
//                }, Materialized.with(Serdes.String(),new AggregateTotalSerde()));

//        final KTable<String, Double> dealerTotal =
//                dealerAggregate.mapValues(value -> value.getAmount(),Materialized.as(dealerSales));
    }
}