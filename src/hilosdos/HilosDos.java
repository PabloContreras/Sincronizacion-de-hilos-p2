
package hilosdos;

/**
 *
 * @author pablo
 */
public class HilosDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        monitor m = new monitor();
        productor p1 = new productor(m,1);
        consumidor p2 = new consumidor(m,1);
        
        
    }
    
}
