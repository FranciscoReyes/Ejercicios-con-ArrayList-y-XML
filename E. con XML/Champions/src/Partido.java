
import com.sun.org.apache.xml.internal.serializer.OutputPropertiesFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francisco A. Reyes
 */
public class Partido {
    
    private String equipo1;
    private String equipo2;
    
    public Partido (String equipo1, String equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }
    
    public Element toElement (Document documento) {
        // Se crea el elemento PARTIDO 
        Element elementoPartido = documento.createElement("PARTIDO");
        // Se crean los elementos EQUIPO que colgaran en el elemento PARTIDO
        Element elementoEquipo1 = documento.createElement("EQUIPO");
        elementoEquipo1.setTextContent(equipo1);
        Element elementoEquipo2 = documento.createElement("EQUIPO");
        elementoEquipo2.setTextContent(equipo2);
        // Los colgamos en PARTIDO
        elementoPartido.appendChild(elementoEquipo1);
        elementoPartido.appendChild(elementoEquipo2);
        
        return elementoPartido;
        
    }
    
   
    
}
