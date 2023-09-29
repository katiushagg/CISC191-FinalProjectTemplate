package edu.sdccd.cisc191.template;

import java.net.*;
import java.io.*;


public class Server {

    public static SurfLocation[] surfLocations = new SurfLocation[10]; //creates an array of locations
    public static void loadSurfLocations(){ //preloading with example
        surfLocations[0] = new SurfLocation("La Jolla Shores", false, "rocky cliffs");
    }
    public static void main(String[] args) {

         //getAtIndex, setAtIndex, findIndexOf, printAll, deleteAtIndex, expand, shrink

        loadSurfLocations();
        for (int i = 0; i < surfLocations.length; i++) {
                System.out.println(surfLocations[i]);
            }
    }
} //end class Server
