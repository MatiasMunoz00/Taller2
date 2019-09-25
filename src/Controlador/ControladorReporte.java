/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.VentaDao;
import Modelo.Vendedor;
import Modelo.Venta;
import java.util.ArrayList;

/**
 *
 * @author paola
 */
public class ControladorReporte {

    public void PromedioVenta() {
        VentaDao vd = new VentaDao();
        ArrayList<Venta> ventas = vd.getVenta();
        for (int i = 0; i < ventas.size(); i++) {

        }
    }

    public void MayorVenta() {
        VentaDao vd = new VentaDao();
        ArrayList<Venta> ventas = vd.getVenta();
    }

    public void MejorVendedor() {
        VentaDao vd = new VentaDao();
        ArrayList<Venta> ventas = vd.getVenta();
        for (int i = 0; i < ventas.size(); i++) {
              if (ventas.get(i).getIdVendedorV()==i) {
                
            }
        }

    }
}
