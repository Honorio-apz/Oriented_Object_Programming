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
public class Libro_class {
    //ATRIBUTOS DE LA CLASE LIBRO
    int ISBN;
    String titulo;
    String autor;
    int Num_pag;
    
    //METODOS
    public void Imprimir(){
        System.out.println("codigo: "+ ISBN);
        System.out.println("titulo: "+ titulo);
        System.out.println("autor: "+ autor);
        System.out.println("numero de paginas: "+ Num_pag);
    }
}
