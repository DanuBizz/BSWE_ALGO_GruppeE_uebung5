package org.example;

import org.example.menu.Menu;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for the Menu class.
 */
class MenuTest {

    @Test
    void happyFlow() {
        // Arrange
        Menu menu = new Menu();
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Act
        int choice = menu.chooseMenuFunction();

        // Assert
        assertEquals(1, choice);
    }

    @Test
    void printMenu_ReturnsFormattedMenu() {
        // Arrange
        Menu menu = new Menu();

        // Act
        String printedMenu = menu.printMenu();

        // Assert
        String expectedMenu = """
                🌍🗺️🌍🗺️🌍🗺️🌍🗺️🌍🗺️🌍🗺️🌍🗺️🌍🗺️🌍🗺️🌍
                🌍                                       🌍
                🗺️              Welcome to               🗺️
                🌍          "KRUSKAL ALGORITHM!"         🌍
                🗺️                                       🗺️
                🌍    To start the KRUSKAL ALGORITHM     🌍
                🗺️            please select:             🗺️
                🌍                                       🌍
                🗺️         (1) START ALGORITHM           🗺️
                🌍                                       🌍
                🗺️                  or                   🗺️
                🌍                                       🌍
                🗺️       (9) EXIT the application        🗺️
                🌍                                       🌍
                🗺️  Thank you for choosing our service!  🗺️
                🌍                                       🌍
                🌍🗺️🌍🗺️🌍🗺️🌍🗺️🌍🗺️🌍🗺️🌍🗺️🌍🗺️🌍🗺️🌍
                """;
        assertEquals(expectedMenu, printedMenu);
    }
}
