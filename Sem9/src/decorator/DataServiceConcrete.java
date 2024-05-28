package decorator;

interface DataService {
    String fetchData();
}
public class DataServiceConcrete implements DataService {
    @Override
    public String fetchData() {
        return "Data";
    }
}

class LoggingDecorator implements DataService {
    private DataService wrappee; // PRIVATE ALWAYSSSSS

    public LoggingDecorator(DataService wrappee) { // nu e neaparat sa il avem in constructor
        this.wrappee = wrappee;
    }

    @Override
    public String fetchData() {
        System.out.println("Fetching data...");
        return wrappee.fetchData();
    }
}

class Main1 {
    public static void main(String[] args) {
        DataService myDataService = new LoggingDecorator(new DataServiceConcrete());
        System.out.println(myDataService.fetchData());

        DataService realDataService = new DataServiceConcrete();

        DataService loggedDataService = new LoggingDecorator(realDataService);

        String data = loggedDataService.fetchData();
        System.out.println("Data Retrieved: " + data);
    }
}
