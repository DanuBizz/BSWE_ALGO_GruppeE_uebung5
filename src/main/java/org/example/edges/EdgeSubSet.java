package org.example.edges;

/**
 * Represents a subset of edges used in a disjoint set data structure.
 *
 * This class provides a simple implementation of a subset with basic properties
 * such as a parent vertex and a rank. It is typically used in disjoint set
 * algorithms for efficient union and find operations.
 *
 * @author Unger Daniel, Leicht Andreas, Alnahhas Khaled
 * @version 1.0
 */
public class EdgeSubSet {

    /**
     * The parent vertex of the subset.
     */
    public char parent;

    /**
     * The rank of the subset, used for optimization in union operations.
     */
    public int rank;

    /**
     * Constructs a new EdgeSubSet with the given parent vertex and rank.
     *
     * @param parent The parent vertex of the subset.
     * @param rank   The rank of the subset.
     */
    public EdgeSubSet(char parent, int rank) {
        this.parent = parent;
        this.rank = rank;
    }
}
