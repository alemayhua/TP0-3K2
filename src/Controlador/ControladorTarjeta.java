/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaResultado;
import Vista.VentanaTarjeta;
import java.awt.Color;

/**
 *
 * @author AleMayhua
 */
public class ControladorTarjeta {

    static VentanaTarjeta vtarjeta = ControladorTarifa.vtarjeta;
    static VentanaResultado vresultado = new VentanaResultado();

    public static void botonElegir() {
        ControladorTarifa.mostrar();
        vtarjeta.dispose();
    }

    public static void numSaldo() {
        int numero = Integer.parseInt(vtarjeta.getjTextFieldnumero().getText());
        float total = 0;
        String estado = vtarjeta.getjLabeltarifa().getText();
        if (estado.equals("Mínimo")) {
            total = numero - 30;
        } else {
            if (estado.equals("Intermedio")) {
                total = numero - 50;
            } else {
                if (estado.equals("Máximo")) {
                    total = numero - 100;
                }
            }
        }
        
        if(total<0){
            vresultado.getjLabelresultado().setForeground(Color.red);
            vresultado.getjLabelresultado().setText("Saldo insuficiente!!");
            vresultado.getjLabelsaldo().setText("$"+numero);
            vtarjeta.dispose();
            vresultado.setLocationRelativeTo(null);
            vresultado.setVisible(true);
        }else{
            vresultado.getjLabelresultado().setForeground(Color.green);
            vresultado.getjLabelresultado().setText("Aprobado!!");
            vresultado.getjLabelsaldo().setText("$"+total);
            vtarjeta.dispose();
            vresultado.setLocationRelativeTo(null);
            vresultado.setVisible(true);
        }
    }

}
