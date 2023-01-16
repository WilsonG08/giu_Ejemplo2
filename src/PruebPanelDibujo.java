import javax.swing.*;

public class PruebPanelDibujo {

    public static void main(String[] args) {

        JFrame aplicacion = new JFrame();

        PanelDibujo panel = new PanelDibujo();

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aplicacion.add(panel);
        aplicacion.setSize(250,250);
        aplicacion.setVisible(true);

    }
}
