package com.package_main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class FlightMap {
    private static HashMap<String, LinkedList<Node>> validFlightPath;
    private static LinkedList<Node> Nodes;
    private static int totalCities;
    //use all read in edges to build flight map
    public static void buildFlightMap(ArrayList<Edge> new_edges){
        Node temp = new Node("", new ArrayList<Edge>());
        ArrayList<String> cities = new ArrayList<String>();
        for (Edge edge :new_edges){
            if(cities.contains((edge.origin))){
                temp.edges.add(edge);
            }else{
                totalCities++;
                cities.add(edge.origin);
                temp.city = edge.origin;
                temp.edges.add(edge);
            }
            Nodes.add(temp);
        }
    }
    //use BFS to find destination
    public static void buildOutput(Node origin, Node destination) {
        // Mark all the vertices as not visited(By default set as false)
        ArrayList<Node> visited = new ArrayList<Node>();

        // Create a queue for BFS
        LinkedList<Node> queue = new LinkedList<Node>();

        // Mark the current node as visited and enqueue it
        visited.add(origin);
        queue.add(Nodes.get(0));

        //create iterator for Nodes list
        Iterator<Node> i = Nodes.listIterator();

        while (queue.size() != 0)
        {
            //current node
            Node curNode = queue.poll();

            // Get all edge nodes of the dequeued vertex
            // If an adjacent has not been visited and it' not the destination, then mark it
            // visited and enqueue it
            while (!curNode.edges.isEmpty())
            {
                int j = 0;
                String n = curNode.edges.get(j).destination;
                if (n != destination.city && !visited.contains(curNode))
                {
                    //set curNode to next destination via edges
                    //curNode = n; -> needs fixing
                    visited.add(curNode);
                    queue.add(curNode);
                }
            }
        }
    }

}
