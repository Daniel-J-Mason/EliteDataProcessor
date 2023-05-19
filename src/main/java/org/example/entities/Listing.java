package org.example.entities;

import lombok.Builder;

import java.util.Date;

@Builder
public record Listing(
        Long id,
        Long station_id,
        Long commodity_id,
        int supply,
        int supply_bracket,
        int buy_price,
        int sell_price,
        int demand,
        int demand_bracket,
        Date collected_at
) {
}
