package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;

/**
 *
 * @author Jhoan Saavedra
 */
public class Recibido  implements  Serializable{
    private boolean bool;
    private Object ob;

    public Recibido(boolean bool, Object ob) {
        this.bool = bool;
        this.ob = ob;
    }

    public Recibido() {
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public Object getOb() {
        return ob;
    }

    public void setOb(Object ob) {
        this.ob = ob;
    }
    
    
    
}
