/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideotecaPackage;

/**
 *
 * @author Francisco A. Reyes
 */
public class Pelicula {
    
    private String título;
    private String director;
    private String año;
    
    Pelicula () {
        
    }
    
    Pelicula (String títuloPeli, String directorPeli, String añoEstreno) {
        this.título = títuloPeli;
        this.director = directorPeli;
        this.año = añoEstreno;  
    }
    
    public void setPelicula(String títuloPeli, String directorPeli, String añoEstreno){
        this.título = títuloPeli;
        this.director = directorPeli;
        this.año = añoEstreno; 
    }
    
    public String getTitulo () {
        String tituloString = this.título;
        return tituloString;
    }
    
    @Override
    public String toString(){
        String infoPeli = "Título: "+ this.título + "\nDirector: " + this.director + "\nAño: " + this.año + "\n";
        return infoPeli;
    }
    
    
}
