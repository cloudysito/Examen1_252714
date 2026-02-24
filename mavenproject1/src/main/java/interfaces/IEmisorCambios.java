/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author emiim
 */
public interface IEmisorCambios {
    void agregarObservador(IObserver obs);
    void eliminarObservador(IObserver obs);
    void notificarObservador();
}
