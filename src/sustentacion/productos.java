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
public class productos {
    
    private String nombre;
    private int cantidad;
    private int valor;
    
    public productos(){
        nombre = "";
        cantidad = 0;
        valor = 0;
    }
    public productos(String n,int c,int v){
        nombre = n;
        cantidad = c;
        valor = v;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
