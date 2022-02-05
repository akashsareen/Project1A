package com.package_main;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EdgeTest {
    @Test
    void testNode(){
        Edge testEdge = new Edge("A", "B", 500);
        assertEquals("A", testEdge.origin, "Edge Origin");
        assertEquals("B", testEdge.destination, "Edge Destination");
        assertEquals(500, testEdge.cost, "Edge Cost");
    }

}