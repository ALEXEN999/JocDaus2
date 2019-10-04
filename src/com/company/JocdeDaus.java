package com.company;

public class JocdeDaus {
    Dau dado1;
    Dau dado2;
    Dau dado3;
    int numV= 0;
    public JocdeDaus(){
        dado1 = new Dau();
        dado2 = new Dau();
        dado3 = new Dau();
    }

    public void jugar(){

        System.out.print("JocDeDaus{");
        dado1.tirar();
        dado1.getValor();
        dado1.imprimir();

        System.out.print(", ");

        dado2.tirar();
        dado2.getValor();
        dado2.imprimir();

        System.out.print(", ");

        dado3.tirar();
        dado3.getValor();
        dado3.imprimir();

        System.out.println("]}");

        if (dado1.getValor() == dado2.getValor() && dado2.getValor() == dado3.getValor()){
            numV++;
        }

    }

}
