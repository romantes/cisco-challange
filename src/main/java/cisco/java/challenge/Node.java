package cisco.java.challenge;

import org.junit.platform.commons.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Node implements GNode {
  private String name;
  private List<Edge> edges;
  private List<Node> nodes;

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

  public void setEdges(List<Edge> edges) {
    this.edges = edges;
  }


  public GNode[] getChildren() {
    if(Objects.isNull(edges)) return new GNode[0];
    return null;
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
