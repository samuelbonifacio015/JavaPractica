package KFC.menu.domain.model.aggregates;

import java.util.Objects;

/**
 * Represents the unique MenuItem with their price.
 * @param menuItemID the menu item unique identifier, it must not be null.
 * @param menuItemName the menu item name, it must not be blank.
 * @param menuItemPrice the menu item price, to identify the cost of the product.
 * @param menuItemCategory the menu item category, it must not be blank.
 * @param recipe the menu item recipe, it must not be blank.
 * @param available the menu item availability, it shows if it's available or not.
 */
public record MenuItem(String menuItemID, String menuItemName, String menuItemPrice, String menuItemCategory,
                       String recipe, Boolean available) {

    /**
     * MenuItem main constructor with validation.
     */
    public MenuItem {
        if (Objects.isNull(menuItemID) || menuItemID.isEmpty()) {
            throw new IllegalArgumentException("Menu item ID is obligatory");
        }
        if (Objects.isNull(menuItemName) || menuItemName.isEmpty()) {
            throw new IllegalArgumentException("Menu item name is obligatory");
        }
        if (Objects.isNull(menuItemPrice) || menuItemPrice.isEmpty()) {
            throw new IllegalArgumentException("Menu item price is obligatory");
        }
        if (Objects.isNull(recipe)) {
            throw new IllegalArgumentException("Recipe is obligatory");
        }
        if (Objects.isNull(available)) {
            throw new IllegalArgumentException("MenuItem needs to display if its available or not");
        }
        if  (Objects.isNull(menuItemCategory)) {
            throw new IllegalArgumentException("Menu item category is obligatory");
        }
    }

    public void updateMenuItem(Float newPrice, String reason) {
    }



}