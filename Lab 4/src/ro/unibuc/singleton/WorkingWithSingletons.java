package ro.unibuc.singleton;

class DatabaseConnection {

    public static final DatabaseConnection INSTANCE;

    private DatabaseConnection() { }

    static {
        INSTANCE = new DatabaseConnection();
    }
}

class SystemConnection {

    private static SystemConnection instance = null;

    private SystemConnection() { }

    public static SystemConnection getInstance() {
        if (instance == null) {
            instance = new SystemConnection();
        }

        return instance;
    }
}

public class WorkingWithSingletons {

    public static void main(String[] args) {
        DatabaseConnection firstDatabaseConnection = DatabaseConnection.INSTANCE;
        DatabaseConnection secondDatabaseConnection = DatabaseConnection.INSTANCE;

        System.out.println("Singletons always use the same instance: " + (firstDatabaseConnection == secondDatabaseConnection));

        SystemConnection firstSystemConnection = SystemConnection.getInstance();
        SystemConnection secondSystemConnection = SystemConnection.getInstance();
        System.out.println("Ensure that there is only one object create for all references: " + (firstSystemConnection == secondSystemConnection));
    }

}
