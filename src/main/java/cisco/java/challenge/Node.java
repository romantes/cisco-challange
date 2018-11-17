package cisco.java.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Node implements GNode {
  private String name;
  private List<Edge> edges;

  public Node(String name) {
    this.name = name;
    edges = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public List<Edge> getEdges() {
    return edges;
  }

  public GNode[] getChildren() {
    if (Objects.isNull(edges)) return new GNode[0];
    return traverse();
  }

  GNode[] traverse() {
    ArrayList<GNode> list = new ArrayList<>();
    if (Objects.isNull(edges)) return new GNode[0];
    traverse(this, list);
    return list.toArray(new GNode[0]);
  }

  void traverse(Node node, List<GNode> list) {
    if (Objects.nonNull(node)) {
      for (Edge e : node.getEdges()) {
        if (Objects.nonNull(e.getEnd()))
          list.add(e.getEnd());
        traverse(e.getEnd(), list);
      }
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Node node = (Node) o;

    return name.equals(node.name);
  }

  @Override
  public int hashCode() {
    return name.hashCode();
  }
}
