package org.example.menu;

import java.util.Scanner;

import lombok.extern.slf4j.Slf4j;
import org.example.helpers.ConsoleColor;

/**
 * This class provides a menu for user interaction in the Kruskal algorithm application.
 * Users can choose to start the algorithm or exit the application.
 * It also handles user input validation.
 *
 * @author Unger Daniel, Leicht Andreas, Alnahhas Khaled
 * @version 1.0
 */
@Slf4j
public class Menu {
    /**
     * Constructs a new Menu object.
     */
    public Menu() {
    }

    /**
     * Displays the menu options to the user and retrieves their choice.
     *
     * @return The user's choice as an integer.
     */
    public int chooseMenuFunction() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println(ConsoleColor.ANSI_CYAN + printMenu() + ConsoleColor.ANSI_RESET);
        System.out.println(ConsoleColor.ANSI_CYAN + "Please enter a number: " + ConsoleColor.ANSI_RESET);
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
        } else {
            log.error(ConsoleColor.ANSI_RED + "Invalid input! Please enter a number!" + ConsoleColor.ANSI_RESET);
        }
        scanner.nextLine();
        return choice;
    }

    public String printMenu() {
        return """
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
    }
}
