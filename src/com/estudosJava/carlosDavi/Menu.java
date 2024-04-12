package com.estudosJava.carlosDavi;
import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
    Scanner scanner = new Scanner(System.in);
    String userInput;

       ArrayList<Pessoa> adicionarPessoasMenu(){
           ArrayList<Pessoa> listaDePessoaParaRetornar = new ArrayList<>();

           do {
               // Your code here

               // Prompt the user for input
               System.out.println("Adicionar pessoa (1) / parar programa (0)");
               userInput = scanner.nextLine();

               if(userInput.equals("1")){
                   Pessoa p = new Pessoa();

                   System.out.println("Digite o nome da pessoa:");
                   p.setNome(scanner.nextLine());
                   /*userInput = scanner.nextLine();*/
                   System.out.println("Digite o sexo da pessoa:");
                   p.setSexo(scanner.nextLine());
                   listaDePessoaParaRetornar.add(p);
               }

               // Continue looping until the user inputs "no"
           } while (!userInput.equals("0"));

           // Clean up resources
           scanner.close();

           return listaDePessoaParaRetornar;
       }
}
