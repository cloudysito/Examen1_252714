/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author emiim
 */
public class DetalleVenta {
    private Producto producto;
    private int cantidad;
    private double subtotal;

    public DetalleVenta(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.calcularSubtotal();
    }

    private void calcularSubtotal() {
        this.subtotal = this.producto.getCosto() * this.cantidad;
    }

    // Getters necesarios para el Observer y la Interfaz
    public Producto getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
    public double getSubtotal() { return subtotal; }
}
