package org.example.entities.system;

import lombok.Builder;

import java.util.List;

@Builder
public record MinorFaction(
        Long id,
        List<State> activeStates,
        Long happinessId,
        double influence,
        List<State> pendingStates,
        List<State> recoveringStates
) {
}
