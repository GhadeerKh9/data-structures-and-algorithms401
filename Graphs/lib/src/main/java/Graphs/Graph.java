package Graphs;

import java.util.*;

public class Graph {

    private final Map<Vertex, List<Vertex>> adjacencyVertices;

    Graph() {
        adjacencyVertices = new HashMap<>();
    }

    public Vertex addNode(String value) {
        Vertex node = new Vertex(value);
        adjacencyVertices.putIfAbsent(node, new ArrayList<>());
        return node;
    }

    public void addEdge(String firstData, String secondData) {
        Vertex v1 = new Vertex(firstData);
        Vertex v2 = new Vertex(secondData);

        adjacencyVertices.get(v1).add(v2);
        adjacencyVertices.get(v2).add(v1);
    }

    public Set<Vertex> gettingNodes() {
        return adjacencyVertices.keySet();
    }

    public List<Vertex> gettingNeighbours(String data) {
        Vertex v = new Vertex(data);
        return adjacencyVertices.get(v);
    }

    public int size() {
        return adjacencyVertices.size();
    }

    public String printGraph() {
        String print = "";
        for (Vertex vertex : adjacencyVertices.keySet()) {
            var element = adjacencyVertices.get(vertex);
            if (!element.isEmpty())
                print +=   vertex + " is connected to " + element;
        }
        return print;
    }



    Set<String> breadthTraversal(String root) {
        Set<String> passed = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        passed.add(root);
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            for (Vertex v : gettingNeighbours(vertex)) {
                if (!passed.contains(v.label)) {
                    passed.add(v.label);
                    queue.add(v.label);
                }
            }
        }
        return passed;
    }
}
