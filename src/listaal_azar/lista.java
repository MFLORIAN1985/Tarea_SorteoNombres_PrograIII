/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaal_azar;

import java.util.List;

/**
 *
 * @author MOORIS FLORIAN
 */
public class lista {
    private String nombre;
    public List<lista> nombres;
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public List<lista> getNombres(){
        return nombres;
    }
    
    public void setNombres(List<lista> nombres){
        this.nombres = nombres;
    }
    
}
