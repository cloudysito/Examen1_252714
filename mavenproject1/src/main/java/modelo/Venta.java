/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import interfaces.IEmisorCambios;
import interfaces.IObserver;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emiim
 */
public class Venta implements IEmisorCambios {
    private String folio;
    private List<DetalleVenta> detalles = new ArrayList<>();
    private List<IObserver> observadores = new ArrayList<>();

    public Venta(String folio) {
        this.folio = folio;
    }

    public void agregarProducto(Producto p, int cant) {
        this.detalles.add(new DetalleVenta(p, cant));
        notificarObservador(); 
    }

    public void eliminarProducto(DetalleVenta detalle) {
    this.detalles.remove(detalle);
    notificarObservador(); 
    }
    
    public double getSubtotal() {
        return detalles.stream().mapToDouble(d -> d.getSubtotal()).sum();
    }

    public double getImpuesto() {
        return getSubtotal() * 0.08;
    }

    public double getTotal() {
        return getSubtotal() + getImpuesto();
    }

    public List<DetalleVenta> getDetalles() { return detalles; }

    @Override
    public void agregarObservador(IObserver obs) { observadores.add(obs); }

    @Override
    public void eliminarObservador(IObserver obs) { observadores.remove(obs); }

    @Override
    public void notificarObservador() {
        for (IObserver o : observadores) { o.actualizar(); }
    }
}
