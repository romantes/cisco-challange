package cisco.java.challenge;

import org.junit.Before;
import org.junit.Test;
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
    Node actual = graph.lookupNode("E").get();
    Node expected = new Node("E");
    assertEquals(expected, actual);
  }

  @Test
  public void getChildrenTest() {
    Node node = graph.lookupNode("B").get();
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

}