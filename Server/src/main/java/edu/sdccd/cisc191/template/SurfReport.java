package edu.sdccd.cisc191.template;

import java.util.Date;

public class SurfReport {
    private Date date;
    private String report;

    public SurfReport(Date date, String report) {
        this.date = date;
        this.report = report;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }
}
