/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VideotecaPackage;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Videoteca {
    
    public ArrayList <Pelicula> listaPelis;
    
    Videoteca () {
        listaPelis = new ArrayList();
                
    }
    
    public ArrayList getLista () {
        return listaPelis;
    }
    
    public void updateRegistro (int posicionRegistro) {
        listaPelis.remove(posicionRegistro);
    }
    
}
