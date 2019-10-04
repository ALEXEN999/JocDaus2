package com.company;

import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.setOut;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
while (true){
    System.out.println("1- Tirar daus\n" + "0- Acabar\n");
    System.out.println("Tria:>");
    int opcion = in.nextInt();
    JocdeDaus partida = new JocdeDaus();
//while (opcion==1) {
    if (opcion == 1) {

        partida.jugar();

    } else if (opcion == 0) {
        System.out.println("Has ganado " + partida.numV + " partidas");
        break;
    }
//    opcion = in.nextInt();
//}
}

    }
}
