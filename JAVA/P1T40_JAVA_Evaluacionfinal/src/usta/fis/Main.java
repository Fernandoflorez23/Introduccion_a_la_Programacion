package usta.fis;
//AUTHOR: Samuel Bermudez,Fernando Florez ,Nataly vargas
//DATE: 26-march-2021
//Description: this software calculate the average height of five boys

import java.util.Scanner;  // para usar el teclado dentro del software

public class Main {

    public static void main(String[] args) {
        p_show_info_program();

        //calculate the average sum / number kids

        float v_average = 0; //la variable v_time es decimal = float / double
        int v_sum_height = 0;
        for (int i = 1; i <= 5; i++) {
            v_sum_height = v_sum_height + p_altura();
        }
        v_average = v_sum_height / 5;
        System.out.println("The average between the kids is: " + v_average + " cms");
    }

    public static void p_show_info_program() {
        //DATE: 26/03/2021
        // DESCRIPTION: This method show the info software
        System.out.println("------------------------------------------------------------------");
        System.out.println("                   Evaluacion Final de Corte                      ");
        System.out.println("                   MAKER: Jhoan Fernando F                        ");
        System.out.println("DESCRIPTION: This program calculate the average between 5 children");
        System.out.println("-------------------------------------------------------------------");
    }

    public static int p_altura() {
        //This method returns the height than user input
        Scanner keyboard = new Scanner(System.in); //use la variable como instancia para el teclado
        System.out.println("Input/type the height of 5 children in cms");
        int v_altura = keyboard.nextInt(); //Pidiendo por teclado la variable numero
        while (v_altura <= 50 || v_altura > 200)
        {
            System.err.println("ERR: The height should be over than 0, input again the height (cm)");
            v_altura = keyboard.nextInt(); //Pidiendo por teclado la variable v_altura
        }
        return v_altura;
    }
}

