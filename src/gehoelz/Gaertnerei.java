package gehoelz;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

public class Gaertnerei {
	
	ArrayList<String> gehoelze = new ArrayList<String>();
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder builder = factory.newDocumentBuilder();
	    Document document = builder.parse( new File("gaertnerei.xml") );
	    System.out.println( document.getFirstChild().getTextContent() );

	}
	public void einkaufen(ArrayList<String> gehoelze){
		
	}
	public void verkaufen(String art, int pflanzjahr){
		
	}
	public ArrayList<String> getWoodByLimit(String art){
		return null;	
	}
}
