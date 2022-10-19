import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class PersonasHandler extends DefaultHandler {

    private ArrayList<Persona> personas = new ArrayList<>();
    private Persona persona;
    private StringBuilder buffer = new StringBuilder();

    public ArrayList<Persona> getPersonas(){
        return personas;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        buffer.delete(0, buffer.length());
        buffer.append(ch, start, length);

    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);

        switch (qName){

            case "persona":
                persona = new Persona();
                personas.add(persona);
                persona.setId(Long.parseLong(attributes.getValue("id")));
                //ver boolean
                break;

        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName){
            case "nombre":
                persona.setNombre(buffer.toString());
                break;
            case "dni":
                persona.setDni(buffer.toString());
                break;
            case "edad":
                persona.setEdad(Integer.parseInt(buffer.toString()));
                break;
            case "salario":
                persona.setSalario(Float.parseFloat(buffer.toString()));
                break;
        }
    }



}
