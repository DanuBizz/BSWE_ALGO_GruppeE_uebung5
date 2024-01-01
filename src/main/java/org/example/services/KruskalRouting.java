package org.example.services;

import org.example.edges.Edge;
import org.example.edges.EdgeSubSet;
import org.example.helpers.ConsoleColor;

import java.util.List;

/**
 * This class implements the Kruskal algorithm for finding a minimum spanning tree (MST) in a graph.
 * It processes a list of edges to construct the MST and prints the results.
 *
 * The algorithm is based on disjoint set data structure for efficient union and find operations.
 *
 * @author Unger Daniel, Leicht Andreas, Alnahhas Khaled
 * @version 1.0
 */
public class KruskalRouting {

    private int counter;
    private int numberOfEdges;
    private Edge[] results;
    private EdgeSubSet[] edgeSubSets;

    /**
     * Runs the Kruskal algorithm to find the minimum spanning tree (MST) of a graph.
     *
     * @param nodes The number of nodes in the graph.
     * @param edges The list of edges in the graph.
     */
    public void runKruskalAlgorithm(int nodes, List<Edge> edges) {
        counter = 0;
        numberOfEdges = 0;
        results = new Edge[nodes - 1];
        edgeSubSets = new EdgeSubSet[nodes];

        generateSubsets(nodes);
        processEdgesForMST(edges);
        printResults();
    }

    /**
     * Initializes the subsets for each node in the graph.
     *
     * @param nodes The number of nodes in the graph.
     */
    public void generateSubsets(int nodes) {
        edgeSubSets = new EdgeSubSet[nodes];
        for (int i = 0; i < nodes; i++) {
            edgeSubSets[i] = new EdgeSubSet((char) ('A' + i), 0);
        }
    }

    /**
     * Processes the edges to construct the Minimum Spanning Tree (MST).
     *
     * @param edges The list of edges in the graph.
     */
    public void processEdgesForMST(List<Edge> edges) {
        while (numberOfEdges < edgeSubSets.length - 1) {
            Edge nextEdge = edges.get(counter);
            char x = findRoot(edgeSubSets, nextEdge.source);
            char y = findRoot(edgeSubSets, nextEdge.destination);

            if (x != y) {
                results[numberOfEdges] = nextEdge;
                union(edgeSubSets, x, y);
                numberOfEdges++;
            }

            counter++;
        }
    }

    /**
     * Performs the union operation on two subsets.
     *
     * @param edgeSubsets The array of subsets representing the nodes.
     * @param x           The root of the first subset.
     * @param y           The root of the second subset.
     */
    private void union(EdgeSubSet[] edgeSubsets, char x, char y) {
        char rootX = findRoot(edgeSubsets, x);
        char rootY = findRoot(edgeSubsets, y);

        if (edgeSubsets[rootY - 'A'].rank < edgeSubsets[rootX - 'A'].rank) {
            edgeSubsets[rootY - 'A'].parent = rootX;
        } else if (edgeSubsets[rootX - 'A'].rank < edgeSubsets[rootY - 'A'].rank) {
            edgeSubsets[rootX - 'A'].parent = rootY;
        } else {
            edgeSubsets[rootY - 'A'].parent = rootX;
            edgeSubsets[rootX - 'A'].rank++;
        }
    }

    /**
     * Finds the root of the subset to which the given node belongs.
     *
     * @param edgeSubSets The array of subsets representing the nodes.
     * @param i           The node whose root needs to be found.
     * @return The root of the subset.
     */
    private char findRoot(EdgeSubSet[] edgeSubSets, char i) {
        if (edgeSubSets[i - 'A'].parent == i)
            return edgeSubSets[i - 'A'].parent;

        edgeSubSets[i - 'A'].parent = findRoot(edgeSubSets, edgeSubSets[i - 'A'].parent);
        return edgeSubSets[i - 'A'].parent;
    }

    /**
     * Prints the results of the Minimum Spanning Tree (MST) including edges and total cost.
     */
    private void printResults() {
        System.out.println("Following are the edges of the constructed MST:");
        int minCost = 0;
        for (int i = 0; i < numberOfEdges; i++) {
            System.out.println(results[i].source + " -- " + results[i].destination + " == "
                    + ConsoleColor.ANSI_YELLOW + results[i].weight + ConsoleColor.ANSI_RESET);
            minCost += results[i].weight;
        }
        System.out.println("Total cost of MST: " + ConsoleColor.ANSI_GREEN + minCost + ConsoleColor.ANSI_RESET);
    }


    //
    /**
     * This method is intended for testing purposes.
     *
     * @return The array of edges in the MST.
     */
    public Edge[] getResults() {
        return results;
    }

    /**
     * This method is intended for testing purposes.
     *
     * @return The total cost of the MST.
     */
    public int getTotalCost() {
        int minCost = 0;
        for (int i = 0; i < numberOfEdges; i++) {
            minCost += results[i].weight;
        }
        return minCost;
    }

}

