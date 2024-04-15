package Composite;

interface DataReader {
    String readData();
}

public class XMLDataReader {
    String readXML() {
        return "Data from XML";
    }
}

class JSONDataReader {
    String readJSON() {
        return "Data from JSON";
    }
}

class XMLAdapter implements DataReader {
    private XMLDataReader xmlReader;
    public XMLAdapter(XMLDataReader xmlReader) {
        this.xmlReader = xmlReader;
    }
    @Override
    public String readData() {
        return xmlReader.readXML();
    }
}

class JSONAdapter implements DataReader {
    private JSONDataReader jsonReader;
    public JSONAdapter(JSONDataReader jsonReader) {
        this.jsonReader = jsonReader;
    }
    @Override
    public String readData() {
        return jsonReader.readJSON();
    }
}

class Main1 {
    public static void main(String[] args) {
        DataReader xmlAdapter = new XMLAdapter(new XMLDataReader());
        DataReader jsonAdapter = new JSONAdapter(new JSONDataReader());
        System.out.println(xmlAdapter.readData());
        System.out.println(jsonAdapter.readData());
    }
}
