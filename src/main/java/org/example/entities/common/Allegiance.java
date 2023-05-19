package org.example.entities.common;

import lombok.Builder;

@Builder
public record Allegiance(
        Long id,
        String name
) {
}
