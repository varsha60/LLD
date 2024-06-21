import designpatterns.singleton.DBConn;
import designpatterns.singleton.Singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        DBConn conn = DBConn.getDBConnObject();
        conn.connect();
        conn.connect();
        conn.connect();

    }
}