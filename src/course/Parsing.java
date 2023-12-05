package course;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Parsing {

    public static Map<String, NodeList> pars(String path) {
        File folder = new File(path);
        Map<String, NodeList> result = new HashMap<>();
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Incorrect path");
            System.exit(0);
        }
        // Проверка на наличие xml файлов в папке
        File[] files = folder.listFiles();
        Set<File> xmlFiles = new HashSet<>();
        Set<File> jsonFiles = new HashSet<>();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    if (file.getName().endsWith(".xml")) {
                        xmlFiles.add(file);
                    } else if (file.getName().endsWith(".json")) {
                        jsonFiles.add(file);
                    }
                }
            }
        }
        if (xmlFiles.isEmpty() && jsonFiles.isEmpty()) {
            System.out.println("No XML and JSON files in folder");
            System.exit(0);
        } else {
            try {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                if(!xmlFiles.isEmpty()){
                for (File file : xmlFiles) {
                    Document document = builder.parse(file);
                    document.getDocumentElement().normalize();
                    NodeList accountOut = document.getElementsByTagName("accountFrom");
                    NodeList accountIn = document.getElementsByTagName("accountTo");
                    NodeList payment = document.getElementsByTagName("payment");
                    result.put("accountFrom", accountOut);
                    result.put("accountTo", accountIn);
                    result.put("payment", payment);
                }
                }
                /*
                if(!jsonFiles.isEmpty()){
                for (File json : jsonFiles) {
                    ObjectMapper mapper = new ObjectMapper();
                    Map<String, Object> jsonMap = mapper.readValue(json, Map.class);
                    result.put("accountFrom", (NodeList) jsonMap.get("accountFrom"));
                    result.put("accountTo", (NodeList) jsonMap.get("accountTo"));
                    result.put("payment", (NodeList) jsonMap.get("payment"));
                    }
                }*/
            } catch (ParserConfigurationException | SAXException | IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}


