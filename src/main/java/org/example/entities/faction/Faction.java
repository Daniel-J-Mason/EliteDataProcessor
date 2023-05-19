package org.example.entities.faction;

import lombok.Builder;
import org.example.entities.common.Allegiance;
import org.example.entities.common.Government;

import java.util.Date;

@Builder
public record Faction(
        Long id,
        String name,
        Allegiance allegiance,
        Government government,
        Long systemId,
        boolean isPlayerFaction,
        Date updatedAt
) {
}
