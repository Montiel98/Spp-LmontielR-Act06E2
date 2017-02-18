
package spp.lmontielr.act06e2;
import java.util.Scanner;
public class SppLmontielRAct06E2 {

    public static void main(String[] args) {
        int n;
   n= pedirnumero();
   calcularelfactorial(n);
   
    }
    public static int pedirnumero(){
        int n;   
        System.out.println("Introduce el numero que desee calular el factorial");
        Scanner dato = new Scanner(System.in);
        n= dato.nextInt();
        if(n<1|| n>10){
            System.out.println("El numero que ingreso esta fuera de rango");
        }else{}
         return n;}           
       public static void calcularelfactorial(int n){
        int fac, cont;
        cont= 1;
        fac=1;
        do{
            cont++;
            fac=fac*(cont);}
            while (cont<(n));
           System.out.println("El factorial es"+ fac);
        }
        
       }             
        
    
    

