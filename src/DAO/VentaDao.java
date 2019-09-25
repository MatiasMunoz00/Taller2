/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Vendedor;
import Modelo.Venta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author paola
 */
public class VentaDao {
        Conexion con;

    public VentaDao() {
        this.con = new Conexion();
    }

    public ArrayList<Venta> getVenta() {

        ArrayList<Venta> ventas = new ArrayList<>();
        Connection accesoBD = con.getConexion();

        try {
            String sql = "SELECT * FROM venta ";

            //System.out.println(sql);
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);

            while (resultados.next()) {
                String fecha = resultados.getString("fecha");
                int idVendedor = resultados.getInt("idVendedor");
                int monto = resultados.getInt("monto");
               String sucursal = resultados.getString("sucursal");
          ventas.add(new Venta(fecha, idVendedor, monto, sucursal));
            }
            // accesoBD.close();
            return ventas;
        } catch (Exception e) {
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }
    }

    public boolean insertarVenta(Venta v) {
        Connection accesoBD = con.getConexion();

        try {
            String sql = "INSERT INTO venta (sucursal,monto,fecha,id_Vendedor) "
                    + "VALUES('" + v.getSucursal()+ "','" + v.getMonto()+ "'," + v.getFecha()+"',"+v.getIdVendedorV() +")";

            Statement st = accesoBD.createStatement();
            st.execute(sql);//execute update es para modificar la BD.
            return true;
        } catch (Exception e) {
            System.out.println("Error al ingresar");
            return false;
        }
  
    }

}
    
