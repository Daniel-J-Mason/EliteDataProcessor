package org.example.entities.system;

import lombok.Builder;

@Builder
public record PowerState(
        Long id,
        String name
) {
}
