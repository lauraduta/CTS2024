package ro.ase.cts.lab04.singleton;

public class DatabaseConnection {
    private static volatile DatabaseConnection instance;
    private DatabaseConnection(){
    }

    public static DatabaseConnection getInstance(){
        if(instance == null){
            synchronized(DatabaseConnection.class){
                if(instance == null){
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }
    public void connect(){
        System.out.println("Connected to database");
    }

    public void disconnect(){
        System.out.println("Disconnected from database");
    }

    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println(db1 == db2);
    }

}
