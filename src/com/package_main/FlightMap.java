package com.package_main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class FlightMap {
    private static HashMap<String, LinkedList<Node>> validFlightPath;
    private static LinkedList Nodes;
    //use all read in edges to build flight map
    public static void buildFlightMap(ArrayList<Edge> new_edges){
        Node temp = new Node("", new ArrayList<Edge>());
        ArrayList<String> cities = new ArrayList<String>();
        for (Edge edge :new_edges){
            if(cities.contains((edge.origin))){
                temp.edges.add(edge);
            }else{
                cities.add(edge.origin);
                temp.city = edge.origin;
                temp.edges.add(edge);
            }
            Nodes.add(temp);
        }
    }
    //use BFS to to find destination
    public static void buildOutput(Node destination) {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[0]=true;
        queue.add(0);

        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s+" ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = Nodes.listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

}
