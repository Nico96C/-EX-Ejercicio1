/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.ejercicio1;

/**
 *
 * @author Nico
 */
public class Tarea implements Comparable<Tarea>{
    
    private String descripcion, tipo;
    private int codigo;

    public Tarea(int codigo, String descripcion, String tipo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public int compareTo(Tarea t) {
        
        if(codigo == t.codigo){
            
            return 0;
        } else if(codigo > t.codigo){
            
            return 1;
        } else {
            
            return -1;
        }
        
    } 
    
}
