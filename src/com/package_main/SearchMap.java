package com.package_main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class SearchMap {
    private static String fileName= null;
    private static Character originCity;
    public static ArrayList<Edge> edges;
    private static void readFile() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            System.out.print("Please provide FlightMap data source: ");
            try{
                fileName = br.readLine();
                br.close();
                try {
                    FileReader reader = new FileReader(fileName);
                    Integer i;
                    originCity = (char)reader.read();
                    while ((i = reader.read()) != -1) {
                        Character next = (char)reader.read();
                        Integer price = reader.read();
                        edges.add(new Edge(i.toString(), next.toString(), price));
                    }
                    reader.close();
                    System.out.println("The file has been properly read.");
                    break;
                }catch (NullPointerException e) {
                    System.out.println("The file " + fileName +" is not formatted properly and is missing parameters.");
                }
            }catch (IOException ioe) {
                System.out.println("The file " +fileName+" could not be found.");
            }
        }
    }
    public static void main(String[] args) {
	// write your code here
        readFile();
        FlightMap.buildFlightMap(edges);

    }
}
