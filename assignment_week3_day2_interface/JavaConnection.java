package assignment_week3_day2_interface;

public class JavaConnection implements DatabaseConnection {

 @Override
 public void connect() {
     System.out.println("Connecting to Database");
 }

 @Override
 public void disconnect() {
     System.out.println("Disconnecting from Database");
 }

 @Override
 public void executeUpdate(String query) {
     System.out.println("Executing query:" + query);
 }

 public static void main(String[] args) {
     JavaConnection db = new JavaConnection();

     db.connect();
     db.executeUpdate("UPDATE employees salary");
     db.disconnect();
 }
}
