package org.example.entities.system;

import lombok.Builder;

@Builder
public record Economy(
        Long id,
        String name
) {
}
