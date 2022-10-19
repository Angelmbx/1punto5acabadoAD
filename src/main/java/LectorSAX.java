import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LectorSAX {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        //saxParserFactory.setNamespaceAware(true);
        SAXParser saxParser = saxParserFactory.newSAXParser();
        File file = new File(Paths.get("src", "main","resources", "personas.xml").toString());
        PersonasHandler handler = new PersonasHandler();
        saxParser.parse(file,handler);

        ArrayList<Persona> Personas = handler.getPersonas();

        for (Persona v : Personas){
            System.out.println(v);
        }


    }
}
