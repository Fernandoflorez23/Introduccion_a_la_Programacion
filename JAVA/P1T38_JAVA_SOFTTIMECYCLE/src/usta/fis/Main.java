package usta.fis;
//AUTHOR: Jhoan Fernando Florez Caballero
//DATE: 23/03/2021
//DESCRIPTION: This software calculate the time rute between two cities
import java.util.Scanner;  // para usar el teclado dentro del software
public class Main {

    public static void main(String[] args) {
	p_show_info_program();
	int v_distance = p_user_distance();
    }
    public static void p_show_info_program() {
        //DATE: 23/03/2021
        // DESCRIPTION: This method show the info software
        System.out.println("------------------------------------------------------------------");
        System.out.println("                   SoftTimeCicle VERSION 1.0                      ");
        System.out.println("                   MAKER: Jhoan Fernando F                        ");
        System.out.println("DESCRIPTION: This program calculate de time rute between two cities");
        System.out.println("-------------------------------------------------------------------");
    }

    public static int p_user_distance(){
    Scanner keyboard = new Scanner(System.in); //use la variable como instancia para el teclado
        int v_distance;
        System.out.println("Input/type distance between two cities");
        v_distance =keyboard.nextInt(); //Pidiendo por teclado la variable v_distance
        while (v_distance<0){
            System.err.println("ERR: The distance should be over than 0, input again the distance between two cities");
        v_distance=keyboard.nextInt(); //Pidiendo por teclado la variable v_distance
        }
        return v_distance;
    }
}
