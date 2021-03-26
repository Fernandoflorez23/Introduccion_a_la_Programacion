package usta.fis;
//AUTHOR: Jhoan Fernando Florez
//Description: This soft calculate the save money
//Date: 25/03/2021

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        int v_total_saved = 0;
        for (int i = 1; i <= 12; i = i + 1) {
            System.out.println("------ Month " + i + "------");
            v_total_saved = v_total_saved + p_user_saved_money();
        }
        System.out.println("The total money saved in the year is $" + v_total_saved);
    }

    public static void p_show_info_program() {
        //DATE: 23/03/2021
        // DESCRIPTION: This method show the info software
        System.out.println("------------------------------------------------------------------");
        System.out.println("                   SavedMoney VERSION 1.0                      ");
        System.out.println("                   MAKER: Jhoan Fernando F                        ");
        System.out.println("DESCRIPTION: This program calculate the saved money");
        System.out.println("-------------------------------------------------------------------");
    }

    public static int p_user_saved_money() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input/type the saved money in the month (COP)$:");
        int v_saved_money = keyboard.nextInt();
        while (v_saved_money < 0) {
            System.err.println("ERR: You saved money cannot be less than zero, input again the saved money (COP)$:");
            v_saved_money = keyboard.nextInt();
        }
        return v_saved_money;
    }
}