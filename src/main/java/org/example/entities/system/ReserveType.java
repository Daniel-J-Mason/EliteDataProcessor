package org.example.entities.system;

import lombok.Builder;

@Builder
public record ReserveType(
        Long id,
        String name
) {
}
