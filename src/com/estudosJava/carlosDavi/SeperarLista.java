package com.estudosJava.carlosDavi;

import java.util.ArrayList;

public class SeperarLista {
    ArrayList<String> separarMasculinos(ArrayList<Pessoa> pessoas){
        ArrayList<String> masculinosSeparados = new ArrayList<>();

        for (int i = 0; i < pessoas.size(); i++){
            if (pessoas.get(i).getSexo().equals("M")){
                masculinosSeparados.add(pessoas.get(i).getNome());
            }
        }
        return masculinosSeparados;
    }
    ArrayList<String> separarFemininos(ArrayList<Pessoa> pessoas){
        ArrayList<String> femininosSeparados = new ArrayList<>();
        for (int i = 0; i < pessoas.size(); i++){
            if (pessoas.get(i).getSexo().equals("F")){
                femininosSeparados.add(pessoas.get(i).getNome());
            }
        }
        return femininosSeparados;
    }
}
