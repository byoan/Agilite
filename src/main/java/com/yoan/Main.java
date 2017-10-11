package com.yoan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String message;
        String convertedMessage;

        System.out.println("Saisissez un message pour ajouter un point à la fin de celui-ci :");
        message = reader.nextLine();
        convertedMessage = addDotToTheEnd(message);
        System.out.println("Le nouveau message est : " + convertedMessage);
    }

    public static String addDotToTheEnd(String message) {
        return message + ".";
    }
}
