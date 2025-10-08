/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preferencia_usuarios;

import notificacion.Notificacion;
import notificacion.PromocionesOfertas;

/**
 *
 * @author Estudiantes
 */
public class UsuarioPromoOferta extends PreferenciaUsuarios{
    
    public UsuarioPromoOferta(String nombre, Notificacion initialNotificacion) {
        super("Promociones y Ofertas", new PromocionesOfertas());
    }
    
}
