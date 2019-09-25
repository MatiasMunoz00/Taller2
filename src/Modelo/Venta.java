/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author paola
 */
public class Venta {
    //Atributos fecha, el id del vendedor que realizó, el monto y la sucursal en donde se realizó la venta. 
    private String fecha;
    private int id;
    private int monto;
    private String sucursal;
    private int idVendedorV;
    
    //Contructores

    public Venta() {
    }

    public Venta(String fecha, int id, int monto, String sucursal) {
        this.fecha = fecha;
        this.id = id;
        this.monto = monto;
        this.sucursal = sucursal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public int getIdVendedorV() {
        return idVendedorV;
    }

    public void setIdVendedorV(int idVendedorV) {
        this.idVendedorV = idVendedorV;
    }
    
    
    
}
