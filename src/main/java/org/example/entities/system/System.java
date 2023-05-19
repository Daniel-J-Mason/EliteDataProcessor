package org.example.entities.system;

import lombok.Builder;
import org.example.entities.common.Allegiance;
import org.example.entities.common.Government;

import java.util.Date;
import java.util.List;

@Builder
public record System(
        Long id,
        String name,
        Allegiance allegiance,
        MinorFaction controllingMinorFaction,
        Long eliteId,
        Long edsmId,
        Government government,
        boolean isPopulated,
        List<MinorFaction> minorFactionsPresence,
        boolean needsPermit,
        int population,
        String power,
        PowerState powerState,
        Economy primaryEconomy,
        ReserveType reserveType,
        List<State> states,
        Date updatedAt,
        double x,
        double y,
        double z
) {
}
