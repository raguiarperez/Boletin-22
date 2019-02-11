
package boletin22;

/**
 * @author raguiarperez
 */
public class Correo {
    private String contido;
    private boolean leido;

    public Correo(String contido, boolean leido) {
        this.contido = contido;
        this.leido = leido;
    }

    public String getContido() {
        return contido;
    }

    public void setContido(String contido) {
        this.contido = contido;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    @Override
    public String toString() {
        return "Contido=" + contido;
    }
    
}
