package org.example.edges;

import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * Represents an edge in a graph with a source, destination, and weight.
 *
 * This class provides a simple implementation of an edge with basic properties
 * such as source, destination, and weight. It also includes a method for
 * comparing edges based on their weights.
 *
 * @author Unger Daniel, Leicht Andreas, Alnahhas Khaled
 * @version 1.0
 */

@Getter
@EqualsAndHashCode
public class Edge {
    /**
     * The source vertex of the edge.
     */
    public char source;

    /**
     * The destination vertex of the edge.
     */
    public char destination;

    /**
     * The weight associated with the edge.
     */
    public int weight;

    /**
     * Constructs a new Edge with the given source, destination, and weight.
     *
     * @param source      The source vertex of the edge.
     * @param destination The destination vertex of the edge.
     * @param weight      The weight associated with the edge.
     */
    public Edge(char source, char destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    /**
     * Compares this edge with another edge based on their weights.
     *
     * @param compareEdge The edge to compare with.
     * @return A negative value if this edge has a lower weight, zero if the
     * weights are equal, and a positive value if this edge has a higher weight.
     */
    public int compareTo(Edge compareEdge) {
        return this.weight - compareEdge.weight;
    }
}

