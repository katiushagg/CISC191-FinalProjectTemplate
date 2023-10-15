package edu.sdccd.cisc191.testruns;

import edu.sdccd.cisc191.template.SurfLocation;
import org.junit.jupiter.api.Test;

public class SurfLocationTest {
    @Test
    void testToString() {
        //Make sure that the overridden toString method is working as expected
        //and printing a proper String
        SurfLocation surfSpot = new SurfLocation("Imperial Beach", true, "pier");
        System.out.println(surfSpot.toString());
    }
}
