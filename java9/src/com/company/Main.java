package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul de elemente din lista: ");
        int n=scanner.nextInt();
        int x,i;
        for (i = 0; i < n; i++){
            System.out.print("Elementul #"+(i+1)+": ");
            x=scanner.nextInt();
            lista.add(x);
        }
        System.out.print("Elementele listei sunt: ");
        for (i = 0; i < n; i++)
            System.out.print(lista.get(i)+" ");
    }
}