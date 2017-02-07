/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Ejercicio3 
{
   
  
            /**)
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lec=new Scanner(System.in);
        System.out.println("Tamaño");
        int tam=lec.nextInt();   
        int[]VectorA=new int[tam];
        int[]VectorB=new int[tam];
        for(int i=0;i<tam;i++){
            System.out.println("Date"+i+"A");
            VectorA[i]=lec.nextInt();
            System.out.println("Data"+i+"B");
            VectorB[i]=lec.nextInt();     
    }         
            
        int[]resultado=
            sumavectores(VectorA,VectorB);
        for(int i=0;i<tam;i++){
            System.out.println(resultado[i]);
        }
    }
        
        
    static int[]sumavectores(int[]A,int []B){
        int []r=new int[A.length];
        for(int i=0;i<A.length;i++){
        r[i]=A[i]+B[i];
        }
        return r; 
    }
}