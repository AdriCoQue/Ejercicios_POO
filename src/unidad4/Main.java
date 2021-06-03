/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4;

/**
 *
 * @author Adrian Corral
 */
public class Main {
    
    private BaseDeDatos db;
    
    public void demoBaseDeDatos(){
        System.out.println("Inicia DEMO");
        
        db = new BaseDeDatos();
        Elemento ele;
        
        ele = new CD("Steady Damage", "Fit For Rivals", 10, 35);
        db.agregarElemento(ele);
        
        ele = new CD("Bon Jovi", "Bon Jovi", 12, 48);
        db.agregarElemento(ele);
        
        ele = new DVD("Back To the Future", 107,"Spielberg", 1985);
        db.agregarElemento(ele);
        
        ele = new DVD("Ready Player One", 125, "Spielberg", 2018);
        db.agregarElemento(ele);
        
        ele= new Libro("La Ladrona de Libros", 780, "No se");
        db.agregarElemento(ele);
        
        ele = new Libro("Maze Runner", 340, "Thomas");
        db.agregarElemento(ele);
        
        System.out.println(db.toString());
    }
    
}
