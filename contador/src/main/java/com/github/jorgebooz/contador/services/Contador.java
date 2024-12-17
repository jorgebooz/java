package com.github.jorgebooz.contador.services;


public class Contador {


    public void FazerContagem(int numero){
        try{
            for (int i = 1; i <= numero; i++) {
                System.out.print(i + " ");
            }
        } catch(Exception e){
            System.out.print("Não foi inserido um numero inteiro");
        }
    }

}
