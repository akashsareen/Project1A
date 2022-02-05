package com.package_main;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    @Test
    void testNode(){
        ArrayList<Edge> testEdges = new ArrayList<>();
        testEdges.add(new Edge("A","B", 500));
        testEdges.add(new Edge("A","C", 100));
        testEdges.add(new Edge("A","D", 300));
        testEdges.add(new Edge("A","Q", 1000));
        Node testNode = new Node("A", testEdges);
        assertEquals("A", testNode.city, "Node City");
        assertEquals("B", testEdges.get(0).destination, "Edge");
    }

}