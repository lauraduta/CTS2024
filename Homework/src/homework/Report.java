package homework;

public interface Report {
    void generateReport();
    void setData(String data);
    void setFormat(String format);
    Report clone();
}

