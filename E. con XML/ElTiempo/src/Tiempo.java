
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Tiempo {
    
    
    public NodeList listaTemperatura;
    
    Tiempo () {
        try {
            DocumentBuilderFactory fábricaCreadorDocumento = DocumentBuilderFactory.newInstance();
            DocumentBuilder creadorDocumento = fábricaCreadorDocumento.newDocumentBuilder();
            URL dir = new URL("http://www.aemet.es/xml/municipios/localidad_11038.xml");
            Document documento = creadorDocumento.parse(dir.openStream());
            
            listaTemperatura = documento.getElementsByTagName("temperatura");
            
            
        } catch (ParserConfigurationException | SAXException ex) {
            Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public NodeList getNode () {
        
        return listaTemperatura;
    }
    
}
