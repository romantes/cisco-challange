package cisco.java.challenge;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static cisco.java.challenge.GraphHelper.createReferenceGraph;
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
}