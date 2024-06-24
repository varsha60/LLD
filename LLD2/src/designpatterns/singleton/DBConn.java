package designpatterns.singleton;

public class DBConn {


    private int numberOfConnections = 0;
    private final int limit = 2;
    private static DBConn dbConnInstance;

    private DBConn () {

    }

    public static DBConn getDBConnObject () {
        if (dbConnInstance == null) {
            dbConnInstance = new DBConn();
        }

        return dbConnInstance;
    }

    public boolean connect () {
        if (numberOfConnections < limit) {
            numberOfConnections++;
            return true;
        } else {
            return false;
        }
    }
}
