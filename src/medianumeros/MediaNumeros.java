/*
14. Calcular la media de una secuencia de números.
 */
package medianumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class MediaNumeros {

    public static void main(String[] args) {

        double num_media;

        do {
            num_media = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero :"));

            if (num_media == 0) {
                JOptionPane.showMessageDialog(null, "Ingresaste un cero");
                System.exit(0);
            }
            num_media = num_media / 2;
            JOptionPane.showMessageDialog(null, "El valor es : " + num_media);

        } while (num_media != 0);

    }

}
