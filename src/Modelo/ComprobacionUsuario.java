/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author sergio
 */
public class ComprobacionUsuario {
    String usuario,contraseña,respuesta;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
  public String login(String usuario,String contraseña ){
      if (usuario.equals("manue")&&contraseña.equals("123")) {
          respuesta="bienvenido";
      }
      return respuesta;
  }
}
