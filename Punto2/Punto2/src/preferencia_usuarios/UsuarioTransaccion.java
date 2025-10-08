/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preferencia_usuarios;

import notificacion.Notificacion;
import notificacion.Transacciones;

/**
 *
 * @author Estudiantes
 */
public class UsuarioTransaccion extends PreferenciaUsuarios{

    public UsuarioTransaccion(String nombre, Notificacion initialNotificacion) {
        super("Notificacion", new Transacciones());
    }

    
    
    
}
