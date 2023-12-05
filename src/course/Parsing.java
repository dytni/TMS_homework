package course;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Parsing {
    private static List<Object> FromNodeToPrim(NodeList nodeList){
        List<Object> list = new ArrayList<>();
        for (int i = 0 ; i< nodeList.getLength(); i++){
            Node temp = nodeList.item(i);
            list.add(temp.getNodeValue());
        }
        return list;
    }
    public static Map<String, List<Object>> pars(String path) {
        File folder = new File(path);
        Map<String, List<Object>> result = new HashMap<>();
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Incorrect path");
            System.exit(0);
        }
        // Проверка на наличие xml и json файлов в папке
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
                for (File file : xmlFiles) {
                    Document document = builder.parse(file);
                    document.getDocumentElement().normalize();
                    result.put ("accountFrom",FromNodeToPrim(document.getElementsByTagName("accountFrom")));
                    result.put("accountTo", FromNodeToPrim(document.getElementsByTagName("accountTo")));
                    result.put("payment", FromNodeToPrim(document.getElementsByTagName("payment")));
                }/*
                for (File file : jsonFiles) {
                    String content = new String(Files.readAllBytes(file.toPath()));
                    JSONObject jsonObject = new JSONObject(content);
                    result.computeIfAbsent("accountFrom", k -> new ArrayList<>()).add(jsonObject.get("accountFrom"));
                    result.computeIfAbsent("accountTo", k -> new ArrayList<>()).add(jsonObject.get("accountTo"));
                    result.computeIfAbsent("payment", k -> new ArrayList<>()).add(jsonObject.get("payment"));
                }*/
            } catch (ParserConfigurationException | SAXException | IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
