package cisco.java.challenge;

import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

public class Graph {
  private ArrayList<Node> nodes;

  Graph() {
    nodes = new ArrayList<>();
  }

  public ArrayList<Node> getNodes() {
    return nodes;
  }

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

  Optional<Node> lookupNode(String name) {
   if(Objects.isNull(name)) return Optional.empty();
    Optional<Node> result =
    nodes.stream()
            .filter(node -> node.getName().equals(name))
            .findFirst();
    return result;
  }
  // need to be specified
  public ArrayList walkGraph(GNode node) {
    return nodes;
  }

  List<List<GNode>> paths(GNode node) {
    Optional<Node> startNode = lookupNode(node.getName());
    List<List<GNode>> paths = new ArrayList<>();
    if(!startNode.isPresent()) return paths;
    paths(paths, new ArrayList<>(), startNode.get());
    return paths;
  }

  private void paths(List<List<GNode>> paths, List<GNode> path, Node node) {
    List<GNode> localPath = new ArrayList<>(path);
    localPath.add(node);

    if (isLeaf(node)) {
      paths.add(localPath);
      return;
    }

    for (Edge e : node.getEdges()) {
        paths(paths, localPath, e.getEnd());
    }
  }

  private boolean isLeaf(Node node) {
    return CollectionUtils.isEmpty(node.getEdges());
  }

}
