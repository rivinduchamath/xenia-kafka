package com.cloudofgoods.cog.dataengineeringconsumer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DataModel {

    String transactionId;
    String make;
    String model;
    String year;
    String saleTimestamp;
    String dealerId;
    String dealerName;
    String state;
    String price;
}