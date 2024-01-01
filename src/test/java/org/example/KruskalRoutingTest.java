package org.example;

import org.example.edges.Edge;
import org.example.services.KruskalRouting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class KruskalRoutingTest {

    private KruskalRouting kruskalRouting;

    @BeforeEach
    void setUp() {
        kruskalRouting = new KruskalRouting();
    }

    @Test
    void happyFlow() {
        // Arrange
        int nodes = 4;
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge('A', 'B', 1));
        edges.add(new Edge('B', 'C', 2));
        edges.add(new Edge('C', 'D', 3));
        edges.add(new Edge('A', 'D', 4));

        // Act
        kruskalRouting.runKruskalAlgorithm(nodes, edges);

        // Assert
        Edge[] results = kruskalRouting.getResults();
        int totalCost = kruskalRouting.getTotalCost();

        // Check the number of edges in the MST
        assertEquals(nodes - 1, results.length);

        // Check if the edges are correct and in the correct order
        assertTrue(results[0].source == 'A' && results[0].destination == 'B' && results[0].weight == 1);
        assertTrue(results[1].source == 'B' && results[1].destination == 'C' && results[1].weight == 2);
        assertTrue(results[2].source == 'C' && results[2].destination == 'D' && results[2].weight == 3);

        // Check the total cost of the MST
        assertEquals(1 + 2 + 3, totalCost);
    }
}
