package com.package_main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SearchMap {
    private String fileName= null;
    private void readFile() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            System.out.print("Please provide FlightMap data source: ");
            try{
                this.fileName = br.readLine();
                br.close();
                try {
                    FileReader reader = new FileReader(fileName);

                    System.out.println("The file has been properly read.");
                    break;
                }catch (NullPointerException e) {

                    System.out.println("The file " + this.fileName +" is not formatted properly and is missing parameters.");
                }
            }catch (IOException ioe) {
                System.out.println("The file " +this.fileName+" could not be found.");

            }
        }
    }
    public static void main(String[] args) {
	// write your code here
    }
}
