/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Graphs;

public class Library {


        public static void main(String[] args) {

            Graph graph = new Graph();

            graph.addNode("M");
            graph.addNode("Ghadeer");
            graph.addNode("Naim");
            graph.addNode("Samar");

            graph.addEdge("M","Ghadeer");
            graph.addEdge("M", "Naim");
            graph.addEdge("M", "Samar");
            graph.addEdge("Ghadeer", "Naim");
            graph.addEdge("Naim", "Samar");
            graph.addEdge("Samar", "Ghadeer");

            System.out.println(graph.printGraph());;

            System.out.println();
            System.out.println(graph.gettingNodes());

            System.out.println();
            System.out.println(graph.gettingNeighbours("Mohammad"));

            System.out.println();
            System.out.println(graph.size());
        }
    }