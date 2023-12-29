/**
 * This is the main class for running the Kruskal algorithm.
 *
 * @author Unger Daniel, Leicht Andreas, Alnahhas Khaled
 * @version 1.0
 */
package org.example;

import org.example.services.KruskalService;

public class KruskalDriver {
    /**
     * The main method of the program, which initializes and runs the Kruskal algorithm.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        KruskalService kruskalService = new KruskalService();
        kruskalService.run();
    }
}
