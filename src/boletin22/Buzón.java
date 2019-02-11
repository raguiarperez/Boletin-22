
package boletin22;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author raguiarperez
 */
public class Buzón {
    public int numeroCorreos(ArrayList<Correo>lista){
        Iterator it = lista.iterator();
        int cont = 0;
       while(it.hasNext()){
           it.next();
           cont++;
       }
       return cont;
    }
    public void añadir(Correo c,ArrayList<Correo>lista){
        lista.add(c);
    }
    public boolean porLer(ArrayList<Correo>lista){
        for(Correo c: lista){
            if(c.isLeido() == false)
                return false;
            }
        return true;
    }
    public void mostrarPorLer(ArrayList<Correo>lista){
        if(this.porLer(lista) ==true){
            System.out.println("Non hai mensaxes sin leer");
        }else{
            System.out.println("hai mensaxes sin leer");
        }
    }

}
