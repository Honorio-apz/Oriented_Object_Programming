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
public class Libro_class_met extends Autor_class {

    //ATRIBUTOS DE LA CLASE LIBRO
    private int ISBN;
    private String titulo;
    private int Num_pag;
    
    public Libro_class_met( int dni, String nombre, String apellidos, int codigo, String titulo_lib, int pag_lib){
        super(dni, nombre, apellidos);
        ISBN = codigo;
        titulo = titulo_lib;
        Num_pag = pag_lib;
    }

    //CONSTRUCTORES
    
    //METODOS GET
    
    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }


    
    public int getNum_pag() {    
        return Num_pag;
    }
    
    //METODOS SET 

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

   

    public void setNum_pag(int Num_pag) {
        this.Num_pag = Num_pag;
    }
    
    
    
    public String Imprimir() {
        return "El nombre del objeto es "+titulo+" y el autor es : "+this.getNombre()+this.getApellidos()+" y tiene: "+Num_pag+" de paginas";
    }

}
