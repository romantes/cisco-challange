package cisco.java.challenge;

import java.util.*;

public class Graph {
  private ArrayList<Node> nodes;

  Graph() {
    nodes = new ArrayList<>();
  }

  public ArrayList<Node> getNodes() {
    return nodes;
  }

  // TODO corner cases
  void add(Node parent, Node node) {
    if(Objects.isNull(parent)) {
      nodes.add(node);
      return;
    }
      Edge edge = new Edge();
      edge.setEnd(node);
      parent.getEdges().add(edge);
      nodes.add(node);
  }

  // TODO corner cases
  Optional<Node> loockupNode(String name) {
    Optional<Node> result =
    nodes.stream()
            .filter(node -> node.getName().equals(name))
            .findFirst();
    return result;
  }

}
