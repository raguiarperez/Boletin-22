
package boletin22;

import Utilidades.pedirDatos;
import java.util.ArrayList;

/**
 *
 * @author raguiarperez
 */
public class Boletin22 {

    public static void main(String[] args) {
        ArrayList<Correo>lista = new ArrayList<>();
        Buzón buz = new Buzón();
        Correo c = new Correo(pedirDatos.string("Contido"), false);
        buz.añadir(c,lista);
        Correo d = new Correo(pedirDatos.string("Contido"), false);   
        buz.añadir(c,lista);
        
        System.out.println("hay "+buz.numeroCorreos(lista)+" correo(s)");
        System.out.println(buz.porLer(lista));
        buz.mostrarPorLer(lista);
        
        
    }
    
}
