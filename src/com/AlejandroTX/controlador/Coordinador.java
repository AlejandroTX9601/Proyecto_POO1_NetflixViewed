/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AlejandroTX.controlador;

import com.AlejandroTX.modelo.Book;
import com.AlejandroTX.modelo.Chapter;
import com.AlejandroTX.modelo.Movie;
import com.AlejandroTX.modelo.Serie;
import com.AlejandroTX.vista.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author RAI
 */
public class Coordinador {
    public static void showMenu(){
        int exit=0;
        do {
            System.out.println("Bienvenidos a Netflix Viewed");
            System.out.println("Selecciona una Opcion: \n" 
            + "1.- Books\n"
            + "2.- Magazine\n"
            + "3.- Movies\n"
            + "4.- Series\n"
            + "\n-------------\n"
            + "5.- Report\n"
            + "6.- Report today\n"
            + "0.- Exit");            
            //leer la respuesta de usuario
            Scanner input = new Scanner(System.in);
            int response= input.nextInt();
            switch(response){
                case 0:
                    break;
                case 1:
                    ShowBooks();
                    break;
                case 2:
                    ShowMagazine();
                    break;
                case 3:
                    //showMovies
                    ShowMovies();
                    break;
                case 4:
                    ShowSeries();
                    break;
                case 5:
                    makeReport();
                    break;
                case 6:
                    makeReport(new Date());
                    break;
                default:
                    System.out.println("");
                    System.out.println("....¡Selecciona una opcion..!");
                    System.out.println("");
                    break;
            }
        } while (exit !=0);
    }
    private static void ShowMovies(){
        int exit =0;
        do {            
            new Movie().setVisible(true);
            System.out.println("");
            System.out.println(":: MOVIES ::");
            System.out.println("");
        } while (exit !=0);
    }
    private static void ShowSeries(){
        int exit =0;
        do {            
            new Series().setVisible(true);
            System.out.println("");
            System.out.println(":: SERIES ::");
            System.out.println("");
        } while (exit !=0);
    }
    private static void ShowChapter(){
        int exit =0;
        do {            
            System.out.println("");
            System.out.println(":: CHAPTER ::");
            System.out.println("");
        } while (exit !=0);
    }
   private static void ShowBooks(){
        int exit =0;
        do {
            new Book().setVisible(true);            
            System.out.println("");
            System.out.println(":: BOOKS ::");
            System.out.println("");
        } while (exit !=0);
    }
   private static void ShowMagazine(){
        int exit =0;
        
        do {
            new Magazine().setVisible(true);            
            System.out.println("");
            System.out.println(":: MAGAZINE ::");
            System.out.println("");
        } while (exit !=0);
    }
   private static void makeReport(){
                makeReport makeReport = new makeReport();
		makeReport.setNameFile("reporte");
		makeReport.setExtension("txt");
		makeReport.setTitle(":: VISTOS ::");
		String contentReport = "";
		
		for (Movie Movie:Movie) {
			if (Movie.getIsViewed()) {
				contentReport += Movie.toString() + "\n";
				
			}
		}
		
		for (Serie Serie : Serie) {
			ArrayList<Chapter> chapters = Serie.getChapters();
			for (Chapter chapter : chapters) {
				if (chapter.getIsViewed()) {
					contentReport += chapter.toString() + "\n";
					
				}
			}	
		}
		
		
		for (Book Book:Book) {
			if (Book.getIsReaded()) {
				contentReport += Book.toString() + "\n";
				
			}
		}

		makeReport.setContent(contentReport);
		makeReport.makeReport();
		System.out.println("Reporte Generado");
		System.out.println();
   
    }
     private static void makeReport(Date date){
       SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-h-m-s-S");
		String dateString = df.format(date);
		makeReport makeReport = new makeReport();
		
		makeReport.setNameFile("reporte" + dateString);
		makeReport.setExtension("txt");
		makeReport.setTitle(":: VISTOS ::");
		
		
		SimpleDateFormat dfNameDays = new SimpleDateFormat("E, W MMM Y");
		dateString = dfNameDays.format(date);
		String contentReport = "Date: " + dateString + "\n\n\n";
		
		for (Movie Movie : Movie) {
			if (Movie.getIsViewed()) {
				contentReport += Movie.toString() + "\n";
				
			}
		}
		
		for (Serie Serie : Serie) {
			ArrayList<Chapter> chapters = Serie.getChapters();
			for (Chapter chapter : chapters) {
				if (chapter.getIsViewed()) {
					contentReport += chapter.toString() + "\n";
					
				}
			}
		}
		
		for (Book Book : Book) {
			if (Book.getIsReaded()) {
				contentReport += Book.toString() + "\n";
				
			}
		}
		makeReport.setContent(contentReport);
		makeReport.makeReport();
		
		System.out.println("Reporte Generado");
		System.out.println();
	}
	  
     }  

