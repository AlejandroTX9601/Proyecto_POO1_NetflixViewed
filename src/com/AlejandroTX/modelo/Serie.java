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
public class Serie {
    private int id;
    private String title;
    private String genero;
    private String creador;
    private int duracion;
    private short year;
    private boolean viewed;
    private int sessionQuantity;
    private Chapter chapter;

    public Serie() {
    }

    public Serie(int id, String title, String genero, String creador, int duracion, short year, boolean viewed, int sessionQuantity, Chapter chapter) {
        this.id = id;
        this.title = title;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
        this.year = year;
        this.viewed = viewed;
        this.sessionQuantity = sessionQuantity;
        this.chapter = chapter;
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
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the creador
     */
    public String getCreador() {
        return creador;
    }

    /**
     * @param creador the creador to set
     */
    public void setCreador(String creador) {
        this.creador = creador;
    }

    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
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
     * @return the sessionQuantity
     */
    public int getSessionQuantity() {
        return sessionQuantity;
    }

    /**
     * @param sessionQuantity the sessionQuantity to set
     */
    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    /**
     * @return the chapter
     */
    public Chapter getChapter() {
        return chapter;
    }

    /**
     * @param chapter the chapter to set
     */
    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }
    
}