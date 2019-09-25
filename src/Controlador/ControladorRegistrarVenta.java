/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.VendedorDao;
import Modelo.Venta;
import Vista.RegistrarVenta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import DAO.VentaDao;
import Modelo.Vendedor;
import com.sun.imageio.plugins.jpeg.JPEG;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author paola
 */
public class ControladorRegistrarVenta implements ActionListener {

    private RegistrarVenta rv;

    public ControladorRegistrarVenta(RegistrarVenta rv) {
        this.rv = rv;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String fecha = this.rv.getFechaTf().getText();
        int monto = Integer.parseInt(this.rv.getMontoTf().getText());
        String Sucursal = this.rv.getSucursalCb().getSelectedItem().toString();
        String Vendedor = this.rv.getVendedorCb().getSelectedItem().toString();
        Venta v = new Venta(fecha, monto, monto, Sucursal);
        VentaDao vd = new VentaDao();
        vd.insertarVenta(v);

    }

    public void setVendedor(RegistrarVenta rv) {
        VendedorDao vd = new VendedorDao();
        ArrayList<Vendedor> Avb = vd.getVendedors();
        
        for (int i = 0; i < Avb.size(); i++) {
            rv.getVendedorCb().addItem(Avb.get(i));
        }
        
    }

}
