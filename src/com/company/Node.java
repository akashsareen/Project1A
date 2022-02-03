package com.company;

import java.util.ArrayList;

public class Node {
    public String city;
    public ArrayList<Edge> edges;
    public Node (String city, ArrayList<Edge> edges){
        this.city = city;
        this.edges = edges;
    }
}
