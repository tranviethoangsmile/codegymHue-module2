package com.codegymhueJava;

import java.util.Date;

public class StopWatch {
    private Date startTime, endTime;
    private double start;
    private double end;

    Date date = new Date();

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Date startTime() {
        Date time = date;
        return time;
    }

    public void start() {
        this.startTime = startTime();
        this.start = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = startTime();
        this.end = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return (end - start);
    }
}