/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author manci
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       
        ArrayList<Aprendiz>listAprendiz=new ArrayList<Aprendiz>();
        Scanner teclado =new Scanner (System.in);
        for (int i = 0; i < 3; i++) {
            Aprendiz miAprendiz=new Aprendiz();
            miAprendiz.setId(i);
            System.out.println("ingrese el nombre del Aprendiz");
            miAprendiz.setNombre(teclado.next());
            System.out.println("ingrese la nota uno");
            miAprendiz.setNota1(teclado.nextInt());
            System.out.println("ingrese la nota dos");
            miAprendiz.setNota2(teclado.nextInt());
            System.out.println("ingrese la nota tres");
            miAprendiz.setNota3(teclado.nextInt());
            
            
            miAprendiz.setNota2(4);
            miAprendiz.setNota3(9);
            listAprendiz.add(miAprendiz);
        }
        
        System.out.println("imprime aprendices");
        for (Aprendiz var:listAprendiz){
            System.out.println(var.getNombre()+" sus notas son :"+var.getNota1()+var.getNota2()+var.getNota3()+" su promedio es :"+(var.getNota1()+var.getNota2()+var.getNota3())/3);
           
        }
        
        
        
        }
        }
        
        
        }
        
    }
    

