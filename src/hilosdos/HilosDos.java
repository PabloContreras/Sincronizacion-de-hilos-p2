
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
        productor p2 = new productor(m,2);
        productor p3 = new productor(m,3);
        consumidor c1 = new consumidor(m,1);
        consumidor c2 = new consumidor(m,2);
        consumidor c3 = new consumidor(m,3);
        p1.run();
        p2.run();
        p3.run();
        c1.run();
        c2.run();
        c3.run();
        
    }
    
}
