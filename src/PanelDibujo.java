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
        // dibuja una línea de la esquina inferior izquierda a la esquina superior derecha
        //g.drawLine(61,15,10,25);


        g.drawLine(40,40,100,200);
        g.drawLine(100,200,160,100);
        g.drawLine(160,100,230,200);
        g.drawLine(230,200,280,40);


    }// fin del método paintComponent

}// fin de la clase PanelDibujo

