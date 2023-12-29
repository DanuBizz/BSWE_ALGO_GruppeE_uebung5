package org.example.services;

import lombok.extern.slf4j.Slf4j;
import org.example.edges.Edge;
import org.example.edges.EdgeList;
import org.example.helpers.ConsoleColor;
import org.example.menu.Menu;

import java.util.*;

/**
 * This class provides the main service for running the Kruskal algorithm.
 *
 * @author Unger Daniel, Leicht Andreas, Alnahhas Khaled
 * @version 1.0
 */
@Slf4j
public class KruskalService {

    KruskalRouting kruskalRouting = new KruskalRouting();
    public List<Edge> edges = EdgeList.generateEdges();
    private int nodes = 7;
    Menu menu = new Menu();

    /**
     * Runs the Kruskal algorithm and presents a menu to the user for various options.
     */
    public void run() {
        try {
            while (true) {
                int choice = menu.chooseMenuFunction();
                switch (choice) {
                    case 1 -> sortEdgesByWeight();
                    case 9 -> {
                        log.info(ConsoleColor.ANSI_YELLOW + "Now leaving..." + ConsoleColor.ANSI_RESET);
                        log.info(ConsoleColor.ANSI_YELLOW + "Program finished!" + ConsoleColor.ANSI_RESET);
                        return;
                    }
                    default -> {
                        System.err.println("Invalid menu choice! Please enter a valid option!");
                    }

                }

                kruskalRouting.runKruskalAlgorithm(nodes, edges);
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    /**
     * Sorts the edges by their weight in ascending order.
     */
    public void sortEdgesByWeight() {
        Collections.sort(edges, Comparator.comparingInt(Edge::getWeight));
    }
}
