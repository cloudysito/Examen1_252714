/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import modelo.DetalleVenta;
import modelo.Producto;
import modelo.Venta;

/**
 *
 * @author emiim
 */
public class ControlVenta {
    private Venta venta;
    private ControlPago controlPago = new ControlPago();

    public ControlVenta(Venta venta) {
        this.venta = venta;
    }

    public void procesarSeleccion(Producto p, int cant) {
        venta.agregarProducto(p, cant);
    }
    
    public boolean procesarTransaccion(String datosTarjeta) {
    boolean exito = controlPago.autorizarPago(venta, datosTarjeta);
    
    if (exito) {
        return true;
    }
    return false;
}
    
    public void eliminarSeleccion(DetalleVenta detalle) {
    venta.eliminarProducto(detalle);
    }
    
}
