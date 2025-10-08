/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subject;

import java.util.ArrayList;
import java.util.List;
import observer.Observer;

/**
 *
 * @author Estudiantes
 */
public class ConcreteSubject implements Subject{
 private List<Observer> observers;
 private String ofertaCursos;
 
    public ConcreteSubject(List<Observer> observers) {
       observers = new ArrayList<>();
    }
 
    public void registerObserver(Observer n) {
      observers.add(n);
    }

    public void removeObserver(Observer n) {
         observers.remove(n);
    }

    @Override
    public void notifyObserver() {
        for(Observer observers:observers){
        observers.update(ofertaCursos);
        }
    }
    
    public String getOfertaCursos(){
    return ofertaCursos;
    }
    
    public void measurementsChanged(){
        notifyObserver();
    }

    @Override
    public void registerObserver() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeObserver() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
