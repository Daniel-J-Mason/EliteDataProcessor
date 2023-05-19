package org.example.entities.system;

import lombok.Builder;

@Builder
public record State(
        Long id,
        String name
) {
}
