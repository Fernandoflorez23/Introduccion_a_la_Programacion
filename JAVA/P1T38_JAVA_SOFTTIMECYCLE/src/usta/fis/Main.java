package usta.fis;
//AUTHOR: Jhoan Fernando Florez Caballero
//DATE: 23/03/2021
//DESCRIPTION: This software calculate the time rute between two cities

import java.util.Scanner;  // para usar el teclado dentro del software
public class Main {

    public static void main(String[] args) {
	p_show_info_program();

	//calculate the time = distance / velocity

        float v_time=0; //la varible v_time es decimal = float / double
        int v_distance = p_user_distance();
        int v_velocity = p_user_velocity();
        v_time = v_distance/v_velocity;
        System.out.println("The time between the two cities is "+v_time+" hours");
    }
    public static void p_show_info_program(){
        //DATE: 23/03/2021
        // DESCRIPTION: This method show the info software
        System.out.println("------------------------------------------------------------------");
        System.out.println("                   SoftTimeCicle VERSION 1.0                      ");
        System.out.println("                   MAKER: Jhoan Fernando F                        ");
        System.out.println("DESCRIPTION: This program calculate de time rute between two cities");
        System.out.println("-------------------------------------------------------------------");
    }

    public static int p_user_distance() {
        //This method returns the distance than user input
        Scanner keyboard = new Scanner(System.in); //use la variable como instancia para el teclado
        int v_distance;
        System.out.println("Input/type      distance between two cities (KM)");
        v_distance = keyboard.nextInt(); //Pidiendo por teclado la variable v_distance
        while (v_distance<=0) {
            System.err.println("ERR: The distance should be over than 0, input again the distance between two cities (KM)");
            v_distance = keyboard.nextInt(); //Pidiendo por teclado la variable v_distance
        }
        return v_distance;
    }
    public static int p_user_velocity(){
        //This method return the velocity input by user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input/Type the constant velocity (KM/H) between the two cities: ");
        int v_velocity = keyboard.nextInt();
        while (v_velocity==0){
            System.err.println("Err: The velocity cannot be same than zero, input again the velocity (KM/H)");
            v_velocity = keyboard.nextInt();
        }
        return v_velocity;
    }
}
