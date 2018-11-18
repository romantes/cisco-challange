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

  // ((A B E) (A B F) (A C G) (A C H) (A C I) (A D))
  public static List<List<GNode>> createReferencePath() {
    List<List<GNode>> list = new ArrayList<>();
    List<GNode> path1 = new ArrayList<>();
    List<GNode> path2 = new ArrayList<>();
    List<GNode> path3 = new ArrayList<>();
    List<GNode> path4 = new ArrayList<>();
    List<GNode> path5 = new ArrayList<>();
    List<GNode> path6 = new ArrayList<>();

    Node A = new Node("A");
    Node B = new Node("B");
    Node C = new Node("C");
    Node D = new Node("D");
    Node E = new Node("E");
    Node F = new Node("F");
    Node G = new Node("G");
    Node H = new Node("H");
    Node I = new Node("I");

    path1.add(A);
    path1.add(B);
    path1.add(E);

    path2.add(A);
    path2.add(B);
    path2.add(F);

    path3.add(A);
    path3.add(C);
    path3.add(G);

    path4.add(A);
    path4.add(C);
    path4.add(H);

    path5.add(A);
    path5.add(C);
    path5.add(I);

    path6.add(A);
    path6.add(D);

    list.add(path1);
    list.add(path2);
    list.add(path3);
    list.add(path4);
    list.add(path5);
    list.add(path6);

   return list;
  }
}



































