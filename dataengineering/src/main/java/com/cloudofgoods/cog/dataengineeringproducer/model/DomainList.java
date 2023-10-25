package com.cloudofgoods.cog.dataengineeringproducer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DomainList implements Serializable {

    List<Domain> domains;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DomainList that = (DomainList) o;
        return Objects.equals(domains, that.domains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domains);
    }

}