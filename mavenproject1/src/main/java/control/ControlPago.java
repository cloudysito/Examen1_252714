/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import modelo.Venta;

/**
 *
 * @author emiim
 */
public class ControlPago {
    public boolean autorizarPago(Venta venta, String tarjeta) {
        if (tarjeta != null && tarjeta.length() == 16) {
            System.out.println("Pago autorizado para la venta: " + venta.getTotal());
            return true;
        }
        return false;
    }
}
