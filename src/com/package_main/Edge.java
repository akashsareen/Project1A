package com.package_main;

public class Edge {
    public String origin;
    public String destination;
    public Integer cost;
    public Node origin_node;
    public Node destination_node;

    public Edge (String origin, String destination, Integer cost) {
        this.origin = origin;
        this.destination = destination;
        this.cost = cost;

    }
}
