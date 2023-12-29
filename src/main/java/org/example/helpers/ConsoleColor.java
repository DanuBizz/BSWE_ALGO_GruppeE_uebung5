package org.example.helpers;

/**
 * Utility class for defining ANSI escape codes for console text color.
 *
 * This class provides static final strings representing ANSI escape codes
 * for cyan, yellow, red text, and a reset code for resetting the text color.
 *
 * @author Unger Daniel, Leicht Andreas, Alnahhas Khaled
 * @version 1.0
 */
public class ConsoleColor {
    /**
     * ANSI escape code for red text.
     */
    public static final String ANSI_RED = "\u001B[31m";
    /**
     * ANSI escape code for cyan text.
     */
    public static final String ANSI_CYAN = "\u001B[36m";

    /**
     * ANSI escape code for yellow text.
     */
    public static final String ANSI_YELLOW = "\u001B[33m";

    /**
     * ANSI escape code for green text.
     */
    public static final String ANSI_GREEN = "\u001B[32m";

    /**
     * ANSI escape code for resetting text color.
     */
    public static final String ANSI_RESET = "\u001B[0m";
}
