/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preferencia_usuarios;

import notificacion.AlertaSaldo;
import notificacion.Notificacion;

/**
 *
 * @author Estudiantes
 */
public class UsuarioSaldo extends PreferenciaUsuarios{
    
    public UsuarioSaldo(String nombre, Notificacion initialNotificacion) {
        super("Saldo", new AlertaSaldo());
    }
    
}
