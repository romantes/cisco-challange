package cisco.java.challenge;

import java.util.ArrayList;
import java.util.List;

public class Node implements GNode {
  private String name;
  private List<Edge> edges;

  public Node(String name) {
    edges = new ArrayList<>();
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public List<Edge> getEdges() {
    return edges;
  }

  public void setEdges(List<Edge> edges) {
    this.edges = edges;
  }

  public GNode[] getChildren() {
    return new GNode[0];
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
