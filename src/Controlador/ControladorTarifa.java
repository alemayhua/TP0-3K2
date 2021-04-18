/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaTarifa;
import Vista.VentanaTarjeta;

/**
 *
 * @author AleMayhua
 */
public class ControladorTarifa {

    static VentanaTarifa vtarifa = new VentanaTarifa();
    static VentanaTarjeta vtarjeta = new VentanaTarjeta();

    public static void mostrar() {
        vtarifa.setLocationRelativeTo(null);
        vtarifa.setVisible(true);
    }

    public static void mostrarvTarjeta() {
        vtarifa.dispose();
        vtarjeta.getjTextFieldnumero().setText("");
        vtarjeta.setLocationRelativeTo(null);
        vtarjeta.setVisible(true);

    }

    public static void Boton30() {
        vtarjeta.getjLabeltarifa().setText("Mínimo");
        mostrarvTarjeta();
    }

    public static void Boton50() {
        vtarjeta.getjLabeltarifa().setText("Intermedio");
        mostrarvTarjeta();
    }

    public static void Boton100() {
        vtarjeta.getjLabeltarifa().setText("Máximo");
        mostrarvTarjeta();
    }

}
