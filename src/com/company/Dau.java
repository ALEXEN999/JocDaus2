package com.company;

import java.util.Random;

public class Dau {
    Random nrandom;
    int valor;

    public Dau(){

        nrandom = new Random();
    }
    public void tirar() {

        valor = nrandom.nextInt(6)+1;
    }
    public void imprimir()
    {
        System.out.print("dau=[Dau{valor="+getValor()+"}");
    }
    public int getValor() {
        return valor;
        /*dado.dau1 = valor.nextInt(6) + 1;
        dado.dau2 = valor.nextInt(6) + 1;
        dado.dau3 = valor.nextInt(6) + 1;
*/
    }
}
