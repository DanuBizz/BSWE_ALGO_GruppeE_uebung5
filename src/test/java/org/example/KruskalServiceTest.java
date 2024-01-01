package org.example;

import org.example.edges.Edge;
import org.example.services.KruskalService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for the KruskalService class.
 */
class KruskalServiceTest {

    private KruskalService kruskalService;

    @BeforeEach
    void setUp() {
        kruskalService = new KruskalService();
    }

    @Test
    void testSortEdgesByWeightValidInputSortsEdges() {
        // Arrange
        List<Edge> edges = kruskalService.edges;

        // Act
        kruskalService.sortEdgesByWeight();
        List<Edge> sortedEdges = kruskalService.edges;

        // Assert
        int[] sortedWeights = sortedEdges.stream().mapToInt(Edge::getWeight).toArray();
        assertEquals(sortedEdges.get(0).getWeight(), 9L);
        assertEquals(sortedEdges.get(1).getWeight(), 10L);
        assertEquals(sortedEdges.get(2).getWeight(), 12L);
        assertEquals(sortedEdges.get(3).getWeight(), 13L);
        assertEquals(sortedEdges.get(4).getWeight(), 14L);
        assertEquals(sortedEdges.get(5).getWeight(), 16L);
        assertTrue(isSorted(sortedWeights));
    }

    // Helper method to check if an array is sorted
    private boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }
}
