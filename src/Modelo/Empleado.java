/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jhoan Saavedra
 */
public class Empleado extends Persona {

    private String contrasena;
    private String cargo;
    private String idcaja;

    public Empleado() {
    }

    /**
     * getContrasena()
     *
     * @return contaseña.
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     *
     * @param contrasena .
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;

    }

    /**
     *
     * @return .
     */
    public String getCargo() {
        return cargo;
    }

    /**
     *
     * @param cargo .
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     *
     * @return .
     */
    public String getIdcaja() {
        return idcaja;
    }

    /**
     *
     * @param idcaja .
     */
    public void setIdcaja(String idcaja) {
        this.idcaja = idcaja;
    }

}
