/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana.tres;

/**
 *
 * @author cdani
 */
public class Edificio {
    
    private String zona;
    private String tipoEdicio;
    private Apartamento[] apartamentos;

    public Edificio(String zona, String tipoEdicio, Apartamento[] apartamentos) {
        this.zona = zona;
        this.tipoEdicio = tipoEdicio;
        this.apartamentos = apartamentos;
    }
    
    
    
}