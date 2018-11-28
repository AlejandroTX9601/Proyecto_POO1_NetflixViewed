/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AlejandroTX.controlador;

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
            //leer la respuest de usuario
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
            System.out.println("");
            System.out.println(":: MOVIES ::");
            System.out.println("");
        } while (exit !=0);
    }
    private static void ShowSeries(){
        int exit =0;
        do {            
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
            System.out.println("");
            System.out.println(":: BOOKS ::");
            System.out.println("");
        } while (exit !=0);
    }
   private static void ShowMagazine(){
        int exit =0;
        do {            
            System.out.println("");
            System.out.println(":: MAGAZINE ::");
            System.out.println("");
        } while (exit !=0);
    }
   private static void makeReport(){
   
    }
     private static void makeReport(Date date){
         
     }
}
