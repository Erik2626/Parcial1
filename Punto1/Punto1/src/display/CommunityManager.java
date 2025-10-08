/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package display;

import observer.Observer;
import subject.Subject;

/**
 *
 * @author Estudiantes
 */
public class CommunityManager implements Display, Observer{
private String ofertaCursos;
private Subject ConcreteSubject;

    public CommunityManager(String post, Subject ConcreteSubject) {
       
        this.ConcreteSubject = ConcreteSubject;
        ConcreteSubject.registerObserver();
    }



    @Override
    public void display() {
        System.out.println("Post:"+ofertaCursos);
    }

    @Override
    public void update(String ofertaCursos) {
       this.ofertaCursos= ofertaCursos;
       display();
    }
    
}
