package cisco.java.challenge;


import java.util.ArrayList;
import java.util.List;

public class GraphHelper {

  /*
A
|-B
| |-E
| |-F
|
|
|-C
| |-G
| |-H
| |-I
|
|-D
   */

  public static Graph createReferenceGraph() {
    Graph graph = new Graph();
    Node A = new Node("A");
    Node B = new Node("B");
    Node C = new Node("C");
    Node D = new Node("D");
    Node E = new Node("E");
    Node F = new Node("F");
    Node G = new Node("G");
    Node H = new Node("H");
    Node I = new Node("I");

    graph.add(null, A);
    graph.add(A, B);
    graph.add(B, E);
    graph.add(B, F);
    graph.add(A, C);
    graph.add(C, G);
    graph.add(C, H);
    graph.add(C, I);
    graph.add(A, D);

    return graph;
  }

  public static List<GNode> createReferenceList() {
    List<GNode> list = new ArrayList<>();

    return list;
  }
}
