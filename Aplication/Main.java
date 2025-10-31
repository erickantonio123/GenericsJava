package Aplication;
import java.util.Scanner;

import Generico.genericos;
import Learning.Learn;
import Service.service;

public class Main {
    

    public static void main(String[] args) {
        System.out.println("Olá mundo");
service ps = new service();
Learn lg = new Learn();

genericos <String> gen = new genericos<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many values");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a value");
            int value = sc.nextInt();
            ps.addValue(value);
        }
        ps.print();
            System.out.println("First value: " + ps.first());

    System.out.println("How many items to add?");
    int m = sc.nextInt();

    for(int i=0; i<m; i++){
        System.out.println("Enter an item:");
        String item = sc.next();
        lg.addItem(item);
    }
lg.mostraritens();
lg.firstItem();

System.out.println("Quantos elementos adicionar?");
String p = sc.next();

for(int i=0; i<p.length();i++){
    System.out.println("Digite o elemento");
    String elemento = sc.next();
    gen.adicionarelemento(elemento);
}
gen.primeiroElemento();








sc.close();
    }
}
