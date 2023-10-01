package edu.sdccd.cisc191.template;

import java.net.*;
import java.io.*;


public class Server {

    public static SurfLocation[][] surfLocations = new SurfLocation[5][5]; //creates an array of locations
    public static SurfReport[][] surfReports = new SurfReport[5][5]; //creates an array of surf reports
    public static void main(String[] args) {

         //getAtIndex, setAtIndex, findIndexOf, printAll, deleteAtIndex, expand, shrink

        loadSurfLocations();
        populateSurfLocations();
       printSurfLocations(surfLocations);


        loadSurfReports();
       /*
        for (int i = 0; i < surfReports.length; i++) {
            System.out.println(surfReports[i]);
        }*/
    }
    public static void loadSurfLocations(){ //preloading with example
        surfLocations[0][0] = new SurfLocation("La Jolla Shores", false, "rocky cliffs");

    }
    public static void populateSurfLocations(){

        surfLocations[0][1]= new SurfLocation("Huntington Beach", false, "sandy beach");
        surfLocations[0][2] = new SurfLocation("Malibu", false, "point break");
        surfLocations[0][3]= new SurfLocation("Trestles", true, "sandy beach");
        surfLocations[0] [4]= new SurfLocation("Rincon", false, "point break");
        surfLocations[1] [0]= new SurfLocation("Zuma Beach", false, "sandy beach");
        surfLocations[1] [1]= new SurfLocation("Venice Beach", false, "urban setting");
        surfLocations[1][2] = new SurfLocation("Salt Creek", true, "point break");
        surfLocations[1] [3]= new SurfLocation("Manhattan Beach", false, "sandy beach");
        surfLocations[1] [4]= new SurfLocation("Newport Beach", false, "pier");
        surfLocations[2] [0]= new SurfLocation("Tourmaline", true, "coastal cliff");
        surfLocations[2][1] = new SurfLocation("Pacific Beach", true, "sand bottom break");
        surfLocations[2] [2]= new SurfLocation("Windansea", false, "waves break far from beach");
        surfLocations[2] [3]= new SurfLocation("Sunset Cliffs", false, "undeveloped coastline");
        surfLocations[2] [4]= new SurfLocation("Ocean Beach", true, "shallow waters");
        surfLocations[3] [0]= new SurfLocation("Mission Beach", true, "sand bottom break");
        surfLocations[3][1] = new SurfLocation("Scripps Beach", true, "pier");
        surfLocations[3] [2]= new SurfLocation("Torrey Pines Beach", false, "sandy beach");
        surfLocations[3] [3]= new SurfLocation("Coronado", true, "small waves");
        surfLocations[3] [4]= new SurfLocation("Black’s Beach", false, "underwater canyon");
        surfLocations[4] [0]= new SurfLocation("Imperial Beach", true, "beach break");
        surfLocations[4][1] = new SurfLocation("Torrey Pines", true, "beach break");
        surfLocations[4] [2]= new SurfLocation("Oceanside", true, "pier");
        surfLocations[4] [3]= new SurfLocation("Solana Beach", true, "pier");
        surfLocations[4] [4]= new SurfLocation("Del Mar", false, "rock bottom reef");

    }
    public static void  printSurfLocations(SurfLocation surfLocationsArray[][]) {

        // Loop through all rows in succession
        for (int i = 0; i < surfLocationsArray.length; i++)

            // Loop through all elements of current row
            for (int j = 0; j < surfLocationsArray[i].length; j++)
                System.out.println(surfLocationsArray[i][j] + " ");

    }
    private static void loadSurfReports() {
        SurfReportImporter surfReportImporter = new SurfReportImporterText();
        //uses interface to access the object of the implemented class
        // The data type (the interface SurfReportImporter) is a pointer.
        // surfReportImporter points to the object SurfReportImporterText.
        // The code that follows is an interface method.
        // Do not want main method to care about importing surf report data.
        // We only want main to care about methods in the interface SurfReportImporter.
        surfReportImporter.importSurfReport();
        //this method (importSurfReport()) is defined
        // in the class that implements the interface SurfReportImporter (SurfReportImporterText)
        //TODO import array of surf reports into a 2D array that will be created.


    }
} //end class Server
