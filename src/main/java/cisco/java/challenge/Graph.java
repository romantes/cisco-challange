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

  //TODO public ArrayList walkGraph(GNode)

   List<List<GNode>> paths(GNode node) {
    Optional<Node> startNode = loockupNode(node.getName());
    List<List<GNode>> lists = new ArrayList<>();
    if(!startNode.isPresent()) return lists;
    //TODO
    return lists;
  }

  List<GNode> path(Node node) {
    if(Objects.isNull(node)) return null;
    List<GNode> path = new ArrayList<>();
    path.add(node);

    if(Objects.nonNull(node.getEdges()) && CollectionUtils.isNotEmpty(node.getEdges())) {
      path(node, path);
    }
    return path;
  }

  void path(Node node, List<GNode> list) {
   if(CollectionUtils.isNotEmpty(node.getEdges())){
    Edge e = node.getEdges().get(0);
       list.add(e.getEnd());
       if(CollectionUtils.isEmpty(e.getEnd().getEdges())) return;
       path(e.getEnd(), list);
     }
   }
}
