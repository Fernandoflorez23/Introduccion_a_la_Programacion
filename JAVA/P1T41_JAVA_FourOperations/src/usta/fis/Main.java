package usta.fis;
//AUTHOR: Jhoan Fernando Florez Caballero
//DATE: 15-04-2021
//Description: this software calculate the sum or rest between two numbers

import java.util.Scanner;  // para usar el teclado dentro del software

public class Main {

    public static void main(String[] args) {
        int v_number1 = 0, v_number2 = 0, v_operacion = 0;
        p_info_program();
        p_operaciones(v_number1, v_number2, v_operacion);
    }
    public static void p_operaciones(int v_number1, int v_number2, int v_operacion) {
        Scanner keyboard = new Scanner(System.in); //use la variable como instancia para el teclado
        System.out.println("Enter the first whole number");
        v_number1 = keyboard.nextInt(); //Pidiendo por teclado la variable numero
        System.out.println("Enter the second whole number");
        v_number2 = keyboard.nextInt();
        System.out.println("Select one option:");
        System.out.println("Suma: 1");
        System.out.println("Resta: 2");
        System.out.println("Multiplication: 3");
        System.out.println("Division: 4");
        System.out.println("Go out: 0");
        v_operacion = keyboard.nextInt();
        while (v_operacion < 0 || v_operacion > 4) {
            System.err.println("ERR: The options entered are not correct, please try again");
            v_operacion = keyboard.nextInt();
        }
        switch (v_operacion) {
            case 0:
                System.out.println("Bye bye");
                break;
            case 1:
                System.out.print("Sum: ");
                System.out.print(v_number1 + v_number2);
                break;
            case 2:
                System.out.println("Resta: ");
                System.out.print(v_number1 - v_number2);
                break;
            case 3:
                System.out.println("Multiplication: ");
                System.out.print(v_number1 * v_number2);
                break;
            default:
                System.out.println("Division: ");
                System.out.print(v_number1 / v_number2);
                break;
        }
    }
    public static void p_info_program() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("                    Maths Calculator                               ");
        System.out.println("                    MAKER: Jhoan Fernando Florez                    ");
        System.out.println("     DESCRIPTION: This program calculate three operations          ");
        System.out.println("-------------------------------------------------------------------");
    }
}
