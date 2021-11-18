package Graphs;

import java.util.Objects;

public class Vertex {

    String label;
    int weight;


    public Vertex(String label, int weight) {
        this.label = label;
        this.weight = weight;
    }

    public Vertex(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Vertex v = (Vertex) object;
        return Objects.equals(label, v.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label);
    }

    @Override
    public String toString() {
        return label;
    }

}
