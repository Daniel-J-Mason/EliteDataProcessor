package org.example.entities.system;

import lombok.Builder;

@Builder
public record state(
        Long id,
        String name
) {
}
