package org.example.entities.system;

import lombok.Builder;

@Builder
public record Security(
        Long id,
        String name
) {
}
