/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.siedrig.ordenavetor;

import java.util.*;

/**
 *
 * @author romeu
 */
public class OrdenaVetor {
    
     private float[] vet;
     private int N;

    public static void main(String[] args) {
        new OrdenaVetor();
      
    }

    public OrdenaVetor() {
        
        vet = new float[10];
        N = vet.length;
        for (int i = 0; i < N; i++) {
            
            vet[i] = geraFloat();
        }
        System.out.println("\nVetor de 10 elementos gerados aleatoriamente");
        System.out.println("com valores entre 0 e 9,999: \n");
        visualizaVetor(vet);

        ordenaVetor(vet);
        System.out.println("\nVetor ordenado: ");
        visualizaVetor(vet);
        
      inverterVetor(vet);
        System.out.println("\nVetor invertido: ");
        visualizaVetor(vet);
        
        
       
    }

    public float geraFloat() {
        Random rnd = new Random();
        float numero = rnd.nextFloat();
        return (numero * 10);
    }

        public void visualizaVetor(float vet[]) {
            for (int i = 0; i < vet.length; i++) {
                System.out.print(vet[i]);
                if (i != vet.length - 1) {
                    System.out.print(" || ");
                }
            }
            System.out.println();
        }

    public boolean ordenaVetor(float[] vet) {
        if (vet == null) {
            return false;
        }
        for (int i = 0; i < vet.length - 1; i++) {
            System.out.println(i);
            int trocas = 0;
            for (int j = 0; j < vet.length - 1 - i; j++) {
                System.out.println(j);
                if (vet[j] > vet[j + 1]) {
                    System.out.println(vet[j] + vet[j + 1]);
                    float tmp = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = tmp;
                    trocas++;
                }
            }
            if (trocas == 0) {
                break;
            }
            
        }
        
        return true;
        
    }
    
    public void inverterVetor(float[] vetor) {
        int start = 0;
        int end = N - 1;
        while (start < end) {
           
            float temp = vetor[start];
            vetor[start] = vetor[end];
            vetor[end] = temp;
            start++;
            end--;
        }
    }
}
