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
public class Autor_class {
    //ATRIBUTOS DE LA CLASE LIBRO
    private int dni;
    private String nombre;
    private String apellidos;
    
    //CONSTRUCTORES
    public Autor_class(int dni, String nombre, String apellidos) {
        this.dni=dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
    }
    
    //metodos
    public int getdni(){return dni;}
    public String getNombre(){return nombre;}
    public String getApellidos(){return apellidos;}
    
  
}
