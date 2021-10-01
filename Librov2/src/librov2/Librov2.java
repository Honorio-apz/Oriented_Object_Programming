/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librov2;

/**
 *
 * @author honorio
 */
public class Librov2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //primer objeto
        //int dni, String nombre, String apellidos, int codigo, String titulo_lib, int pag_lib
        Libro_class_met Computer_Science = new Libro_class_met(4872364, "Honorio", "Apaza",2012,"Computer Science", 67456875);
        System.out.println(Computer_Science.Imprimir());
        
        //uso de metodo set
        //Computer_Science.this.setNombre("Rene Mamani");
        //System.out.println(Computer_Science.Imprimir());
        
        //regundo objeto
        Libro_class_met System_recommendation = new Libro_class_met(78363, "Pedro","Castillo", 2012,"System Recommedation", 435);
        System.out.println(System_recommendation.Imprimir());
        
        //uso de metodo get
        if (Computer_Science.getNum_pag()>System_recommendation.getNum_pag()){
            System.out.println(Computer_Science.getTitulo()+" es el libro mas pesado");
        }else{
            System.out.println(System_recommendation.getTitulo()+" es el libro mas pesado");
        }
    }
    
}
