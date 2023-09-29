package edu.sdccd.cisc191.template;

import java.net.*;
import java.io.*;


public class Server {

    public static SurfLocation[] surfLocations = new SurfLocation[10]; //creates an array of locations

    public static void main(String[] args) {

         //getAtIndex, setAtIndex, findIndexOf, printAll, deleteAtIndex, expand, shrink

        loadSurfLocations();
        for (int i = 0; i < surfLocations.length; i++) {
                System.out.println(surfLocations[i]);
            }

        loadSurfReports();

    }
    public static void loadSurfLocations(){ //preloading with example
        surfLocations[0] = new SurfLocation("La Jolla Shores", false, "rocky cliffs");
    }
    private static void loadSurfReports() {
        SurfReportImporter surfReportImporter = new SurfReportImporterText();//uses interface to access the object of the implemented class
    // The data type is a pointer. It points to the object SurfReportImporterText.
        // The code that follows is interface methods. Do not want main method to care about importing surf report data.
        // We only want main to care about methods in the interface SurfReportImporter.
        surfReportImporter.importSurfReport();//this method is defined in the class that implements SurfReportImporter
        //TODO import array of surf reports into a 2D array that will be created.

    }
} //end class Server
