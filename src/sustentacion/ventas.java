/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustentacion;

/**
 *
 * @author Vanegas
 */
public class ventas {
    private int venta;
    private int ganancia;

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }
      
    public ventas(int v){
        venta=v;        
    }
    
}
