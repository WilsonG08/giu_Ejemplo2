// Uso de drawLine para conectar las esquinas de un panel.
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel{

    // dibuja una x desde las esquinas del panel
    public void paintComponent(Graphics g){

        // llama a paintComponent para asegurar que el panel se muestre correctamente
        super.paintComponent(g);

        int anchura =  getWidth(); // anchura total
        int altura = getHeight(); // altura total

        // dibuja una línea de la esquina superior izquierda a la esquina inferior derecha
        g.drawLine(20,20,50,100);
        g.drawLine(50,100,80,50);
        g.drawLine(80,50,115,100);
        g.drawLine(115,100,140,-100);

        // dibuja una línea de la esquina inferior izquierda a la esquina superior derecha
        //g.drawLine(61,15,10,25);
// g.drawLine(300,400,200,100);

    }// fin del método paintComponent

}// fin de la clase PanelDibujo

