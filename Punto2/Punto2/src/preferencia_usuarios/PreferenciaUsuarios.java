/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preferencia_usuarios;

import notificacion.Notificacion;

/**
 *
 * @author Estudiantes
 */
public abstract class PreferenciaUsuarios {
    private final String usuario;
    private Notificacion notificacion;

    protected PreferenciaUsuarios(String nombre, Notificacion initialNotificacion) {
        this.usuario = nombre;
        this.notificacion = initialNotificacion;
    }

    public String getUsuario(){
    return usuario;
    }
    
    public void setNotificacion(Notificacion notificacion){
    if(notificacion ==null) throw new IllegalArgumentException("La notificacion no puede ser null");
    this.notificacion = notificacion;
    System.out.println(usuario+"recibe"+ notificacion.getUsuario());
    }
    
}
