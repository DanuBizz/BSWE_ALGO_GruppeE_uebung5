package org.example.edge;

public class Edge {
    public char source;
    public char destination;
    public int weight;

    public Edge(char source, int weight, char direction) {
        this.source = source;
        this.weight = weight;
        this.destination = direction;
    }

    public int compareTo(Edge compareEdge) {
        return this.weight - compareEdge.weight;
    }
}
