package com.cloudofgoods.cog.dataengineeringconsumer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AggregateTotal {

    long count;
    double amount;

}