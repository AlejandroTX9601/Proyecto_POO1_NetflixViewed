/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AlejandroTX.modelo;

/**
 *
 * @author RAI
 */
public class Chapter {
    private int id;
    private String tittle;
    private int duration;
    private short year;
    private boolean viewed;
    private int timeViewed;
    
    private int sessionNumber;

    public Chapter() {
    }

    public Chapter(int id, String tittle, int duration, short year, boolean viewed, int timeViewed, int sessionNumber) {
        this.id = id;
        this.tittle = tittle;
        this.duration = duration;
        this.year = year;
        this.viewed = viewed;
        this.timeViewed = timeViewed;
        this.sessionNumber = sessionNumber;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the tittle
     */
    public String getTittle() {
        return tittle;
    }

    /**
     * @param tittle the tittle to set
     */
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    /**
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * @return the year
     */
    public short getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(short year) {
        this.year = year;
    }

    /**
     * @return the viewed
     */
    public boolean isViewed() {
        return viewed;
    }

    /**
     * @param viewed the viewed to set
     */
    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    /**
     * @return the timeViewed
     */
    public int getTimeViewed() {
        return timeViewed;
    }

    /**
     * @param timeViewed the timeViewed to set
     */
    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    /**
     * @return the sessionNumber
     */
    public int getSessionNumber() {
        return sessionNumber;
    }

    /**
     * @param sessionNumber the sessionNumber to set
     */
    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }
    
    
}
