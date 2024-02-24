

package com.mycompany.ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {
    

    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        Scanner h=new Scanner (System.in);
          System.out.println("Esto es un cambio");
        System.out.print("Inserte número de celdas: ");
        int op, N;
        N= leer.nextInt();
        System.out.println("");
        Pila s= new Pila (N);
       String cad="", elemento;
       
        while (!cad.equalsIgnoreCase("terminar programa")){
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Mostrar elementos");
            System.out.println("4. Verificar pila vacía");
            System.out.println("5. Verificar pila llena");
            System.out.println("6. Vaciar pila");
            op=leer.nextInt();
            System.out.println("");
            switch (op){
                case 1: 
                    System.out.print("Ingrese elemento: ");
                    elemento= h.nextLine();
                    System.out.println("Elemento agregado:" + s.agregar_elemento(elemento));
                    
                    break;
                
                case 2: 
                    System.out.println("Elemento eliminado: "+ s.eliminar_elemento());
                   
                    break;
                    
                case 3:
                    s.mostrar_elementos();
                    
                    break;
                
                case 4: 
                    System.out.println("Pila vacía: "+ s.verficar_vacía());
                    
                    break;
                    
                case 5: 
                    System.out.println("Pila llena: "+ s.verficar_llena());
                    break;
                    
                default:
                    s.vaciar_pila();
                    System.out.println("Pila vaciada");
                    break;
                    
            }
            System.out.println("");
            System.out.println("¿Desea seguir?: ");
            cad= h.nextLine();
            System.out.println("");
            
        }
     
    }
}

class Pila{
    String vector [];
    int cont= 0;
    Pila (int N){
        vector= new String [N];  
        
    }
    
    
    public boolean agregar_elemento (String cadena){
        boolean band=true;
        
        if (cont==vector.length){
           return band=false;
           
        }
        else {
           vector [cont]= cadena;
           cont++;
           return band;
           
        }
        
    }
    
    public String eliminar_elemento (){
        String cad;
        if (cont>0){
            cad= vector[cont-1];
            cont--;
            return cad;
        }
        
        else {
            return cad="";
            
        }
        
    }
    
     public void mostrar_elementos (){
         System.out.print("Elementos: ");
         for (int i = 0; i < cont; i++) {
             System.out.print(vector[i]+ "* ");
             
         }
         
    }
    
    public boolean verficar_vacía (){
        boolean band=true;
        if (cont==0){
            return band;
            
        }
        else {
            
           return band=false;
        }
        
    }
    
    public boolean verficar_llena (){
        boolean band=true;
        if (cont==vector.length){
            return band;
            
        }
        else {
            return band=false;
            
        }
        
    }
    
    public void vaciar_pila (){
        cont=0;
        
    }
    
    
}