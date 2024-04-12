package com.estudosJava.carlosDavi;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> listaPessoas;
        SeperarLista separar =  new SeperarLista();

        Menu menu = new Menu();

       listaPessoas = menu.adicionarPessoasMenu();

       System.out.println("*** Lista de pessoas do sexo masculino ---> " + separar.separarMasculinos(listaPessoas));
       System.out.println("*** Lista de pessoas do sexo feminino ---> " + separar.separarFemininos(listaPessoas));

    }
}
