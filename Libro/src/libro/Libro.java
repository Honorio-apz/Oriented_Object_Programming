/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

/**
 *
 * @author honorio
 */
public class Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CREANDO OBJETOS
     
        Libro_class Computer_Science;
        Computer_Science = new Libro_class();
        
        Computer_Science.ISBN=1234;
        Computer_Science.titulo="Computer Science";
        Computer_Science.autor="Carlos Silva";
        Computer_Science.Num_pag=5000;
        
        Libro_class Inteligencia_artificial;
        Inteligencia_artificial = new Libro_class();
        
        Inteligencia_artificial.ISBN=1234345;
        Inteligencia_artificial.titulo="Artificiall Intelligence";
        Inteligencia_artificial.autor="Ernesto Cuadros";
        Inteligencia_artificial.Num_pag=10000;
        
        //CONVOCANDO A METODOS
        Computer_Science.Imprimir();
        
        Inteligencia_artificial.Imprimir();
    }
    
}
