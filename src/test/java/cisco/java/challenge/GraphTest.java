package cisco.java.challenge;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static cisco.java.challenge.GraphHelper.createReferenceGraph;
import static cisco.java.challenge.GraphHelper.createReferencePath;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GraphTest {
  Graph graph;

  @Before
  public void setUp() {
    graph = createReferenceGraph();
  }

  @Test
  public void loockupNode() {
    Node actual = graph.loockupNode("E").get();
    Node expected = new Node("E");
    assertEquals(expected, actual);
  }

  @Test
  public void getChildrenTest() {
    Node node = graph.loockupNode("B").get();
    GNode[] expected = {new Node("E"), new Node("F")};
    GNode[] actual = node.getChildren();
    assertArrayEquals(expected, actual);
  }

  @Test
  public void pathsTest() {
    List<List<GNode>> expected = createReferencePath();
    List<List<GNode>> actual = graph.paths(new Node("A"));
    assertEquals(expected, actual);
  }

  @Test
  public void pathFirstForATest() {
    List<GNode> expected = new ArrayList<>();
    expected.add(new Node("A"));
    expected.add(new Node("B"));
    expected.add(new Node("E"));

    List<GNode> actual = graph.path(graph.getNodes().get(0));
    assertEquals(expected, actual);
  }

}