package edu.sdccd.cisc191.testruns;

import edu.sdccd.cisc191.template.SurfReportImporter;
import edu.sdccd.cisc191.template.SurfReportImporterText;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ImporterTest {
    @Test
    void testInterface() {
        // Make sure that the SurfReportImporterText class is indeed an
        // implementation of the SurfReportImporter interface
        SurfReportImporterText newObj = new SurfReportImporterText();
        assertTrue(newObj instanceof SurfReportImporterText);
        assertTrue(newObj instanceof SurfReportImporter);
    }
}
