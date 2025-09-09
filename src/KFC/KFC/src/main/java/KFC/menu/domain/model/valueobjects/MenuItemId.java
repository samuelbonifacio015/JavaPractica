package KFC.menu.domain.model.valueobjects;

import KFC.menu.domain.model.aggregates.MenuItem;

import java.util.Objects;
import java.util.UUID;

/**
 * Represents a unique identifier to a MenuItem with valueobjects bounded context
 * @param id the product identifier value, it must not be null.
 * @author Samuel Bonifacio
 */
public record MenuItemId(UUID id) {

    /**
     * Constructs a MenuItem object with random id
     * @param id is the main identifier to every menuItem
     * @throws IllegalArgumentException if the value is null
     */
    public MenuItemId {
        if (Objects.isNull(id)) {
            throw new IllegalArgumentException("MenuItem cannot be null");
        }
    }

    /**
     * Constructs a random UUID unique id
     */
    public MenuItemId() {
        this(UUID.randomUUID());
    }
}
