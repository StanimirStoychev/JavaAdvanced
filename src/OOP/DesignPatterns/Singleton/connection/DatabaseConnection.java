package OOP.DesignPatterns.Singleton.connection;
public class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }

        return instance;
    }

    public void readData() {
        System.out.println("Reading from DB");
    }

    public void writeData() {
        System.out.println("Writing to the DB");
    }
}
