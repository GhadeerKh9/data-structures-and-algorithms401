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


    public void addEdgeWithWeight(String data1, String data2, int weight) {
        Vertex Vertex1 = new Vertex(data1, weight);
        Vertex Vertex2 = new Vertex(data2, weight);


        adjacencyVertices.get(Vertex1).add(Vertex2);
        adjacencyVertices.get(Vertex2).add(Vertex1);
    }

    public String businessTrip(Graph graph, List<String> nameOfCities) {
        int cost = 0;
        if (nameOfCities.size() <= 1)
            return "null";

        int findWeight;
        for (int i = 0; i < nameOfCities.size() - 1; i++) {
            findWeight = findWeight(graph, nameOfCities.get(i), nameOfCities.get(i + 1));

            if (findWeight == 0)
                return "False, $0";

            cost += findWeight;
        }
        return "True, $" + cost;
    }

    private int findWeight(Graph g, String firstCity, String secondCity) {
        for (Vertex v : g.gettingNeighbours(firstCity)) {
            if (Objects.equals(secondCity, v.label)) {
                return v.weight;
            }
        }
        return 0;
    }


    public Set<String> depthFirst(String root) {
        if (adjacencyVertices.isEmpty()) {
            return null;
        }
        Set<String> string = new LinkedHashSet<>();

        Stack<String> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            String v2 = stack.pop();
            if (!string.contains(v2)) {
                string.add(v2);

                for (Vertex v : gettingNeighbours(v2)) {
                    stack.push(v.label);
                }
            }
        }

        return string;
    }
}




