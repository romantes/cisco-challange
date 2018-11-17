package cisco.java.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static cisco.java.challenge.GraphHelper.createReferenceGraph;
import static org.junit.jupiter.api.Assertions.*;

class GraphTest {
  Graph graph;

  @BeforeEach
  void setUp() {
    graph = createReferenceGraph();
  }

  @Test
  void loockupNode() {
    Node actual = graph.loockupNode("E").get();
    Node expected = new Node("E");
    assertEquals(expected, actual);
  }

  @Test
  void walkGraphTest() {

  }
}