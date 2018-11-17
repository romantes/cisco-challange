package cisco.java.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Graph {
  private List<Node> nodes;

  Graph() {
    nodes = new ArrayList<>();
  }

  public List<Node> getNodes() {
    return nodes;
  }

  public void setNodes(List<Node> nodes) {
    this.nodes = nodes;
  }

  // TODO corner cases
  void add(Node parent, Node node) {
    if(Objects.isNull(parent)) {
      nodes.add(node);
      return;
    }
    if (!isConnectionExists(parent, node)) {
      Edge edge = new Edge();
      edge.setEnd(node);
      parent.getEdges().add(edge);
      nodes.add(node);
    }
  }

  // TODO corner cases
  Optional<Node> loockupNode(String name) {
    Optional<Node> result =
    nodes.stream()
            .filter(node -> node.getName().equals(name))
            .findFirst();
    return result;
  }

  // TODO
  boolean isConnectionExists(Node parent, Node node) {
    return false;
  }
}
