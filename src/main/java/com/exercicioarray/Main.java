package com.exercicioarray;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //tipo de cada elemento do array[] nome do array = new 
        //Q1 - Declare um array de inteiros chamado myArray com tamanho 5.
        int[] myArray = new int[5];
        
        //Q2 - Como você acessaria o terceiro elemento do array myArray?
        System.out.printf("O terceiro elemento do array myArray é: %d\n\n", myArray[2]);
        //ou
        System.out.println("O terceiro elemento do array myArray é: " + myArray[2] + "\n"); 

        //Q3 - Inicialize um array de strings chamado frutas com os valores "Maçã", "Banana" e "Morango".
        String[] fruits = {"Apple", "Banana", "Strawberry"};

        //Q4 - Escreva um loop for para percorrer e imprimir cada elemento do array frutas.
        for (int i=0; i<fruits.length; i++){
            System.out.println(fruits[i]);  
            //i = 0     i<3     print(Apple)        i++
            //i = 1     i<3     prstatic int(Banana)       i++
            //i = 2     i<3     print(Strawberry)   i++
            //i = 3     i<3
        }
        System.out.println("\n");

        //Q5 - Crie um ArrayList chamado nomes que armazenará strings
        ArrayList<String> names = new ArrayList<>();

        //Q6 - Adicione os nomes "Alice", "Bob" e "Charlie" ao ArrayList nomes
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        //TESTE Q6
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        System.out.println("\n");

        //Q7 - Remova o nome "Bob" do ArrayList nomes
        names.remove(1);

        //TESTE Q7
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        System.out.println("\n");

        //Q8 - Como você verifica se um nome específico, como "Alice", está presente no ArrayList?
        if(verificacao(names)){
            System.out.println("Alice esta presente no ArrayList\n");
        }else{
            System.out.println("Alice NÃO esta presente no ArrayList\n");
        }

        //Q9 - Qual método você usaria para obter o número de elementos no ArrayList?
        System.out.printf("O número de elementos do ArrayList é %d\n\n", names.size());
        //ou
        System.out.println("O número de elementos do ArrayList é " + names.size() + "\n");

        //Q10 - Converta o ArrayList nomes para um array de strings chamado nomesArray
        String[] namesArray = new String[names.size()];
        namesArray = names.toArray(namesArray);

        //TESTE Q10
        for(int i=0; i < namesArray.length; i++){
            System.out.println(namesArray[i]);
        }

        System.out.println("\n");

        //Q11 - Limpe todos os elementos do ArrayList nomes
        names.clear();

        //TESTE Q11
        System.out.println("O número de elementos do ArrayList é " + names.size() + "\n");

    }

    //Parte da resolução da Q8
    public static boolean verificacao(ArrayList<String> names){

        for(int i = 0; i < names.size(); i++){
            if(names.get(i).equalsIgnoreCase("Alice") == true){
                return true;
           }
        }

        return false;
    }

}