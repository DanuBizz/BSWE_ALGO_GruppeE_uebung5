package org.example.edges;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class for generating a list of edges.
 *
 * This class provides a static method to generate a list of edges for testing
 * or demonstration purposes.
 *
 * @author Unger Daniel, Leicht Andreas, Alnahhas Khaled
 * @version 1.0
 */
public class EdgeList {

    /**
     * Generates a list of edges with sample data.
     *
     * @return A list of edges with sample data.
     */
    public static List<Edge> generateEdges() {
        List<Edge> edges = new ArrayList<>();

        edges.add(new Edge('E', 'G', 16));
        edges.add(new Edge('C', 'E', 9));
        edges.add(new Edge('B', 'D', 18));
        edges.add(new Edge('B', 'C', 16));
        edges.add(new Edge('D', 'G', 12));
        edges.add(new Edge('A', 'B', 14));
        edges.add(new Edge('A', 'D', 10));
        edges.add(new Edge('D', 'E', 30));
        edges.add(new Edge('F', 'G', 22));
        edges.add(new Edge('D', 'F', 17));
        edges.add(new Edge('B', 'E', 13));

        return edges;
    }
}
