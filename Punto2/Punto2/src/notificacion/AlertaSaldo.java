/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificacion;

/**
 *
 * @author Estudiantes
 */
public class AlertaSaldo implements Notificacion{

    @Override
    public String getUsuario() {
      
        return "saldo....";
      
    }

    @Override
    public void cast(String caster, String target) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

   
    
}
