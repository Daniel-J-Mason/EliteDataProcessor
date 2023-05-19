package org.example.entities.common;

import lombok.Builder;

@Builder
public record Government(
        Long id,
        String name
) {
}
