/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaal_azar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author MOORIS FLORIAN
 */
public class ListaAl_Azar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ClsConexion conec = new ClsConexion();
        lista persona;
        Iterator it = conec.nombres().iterator();
        ArrayList<String> participantes = new ArrayList<>();
        ArrayList<String> ganadores = new ArrayList<>();

        System.out.println("Participantes: \n");

        while (it.hasNext()) {
            persona = (lista) it.next();

            System.out.println(persona.getNombre());
            participantes.add(persona.getNombre());
        }

        Collections.shuffle(participantes);
        
        System.out.println("");
        

        for (int i = 0; i < 10; i++) {
            ganadores.add(participantes.get(i));
            participantes.remove(i);
          //  System.out.println("Ganador: " + ganadores.get(i));
        }
       
       System.out.println("\nGanadores y perdedores");
       
     System.out.println("\n Personas eliminadas: \n ");
          Collections.sort(participantes);
       
       System.out.println(participantes);
       
       System.out.println("\n Ganadores del sorteo: \n");
       
              System.out.println(ganadores);

       // System.out.println(participantes);

    }

}
