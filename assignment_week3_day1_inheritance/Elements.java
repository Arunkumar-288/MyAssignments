package assignment_week3_day1_inheritance;

public class Elements extends Button {

 public static void main(String[] args) {
     Elements el = new Elements();
     el.click();
     el.setText("Hello Execution");
     el.submit();
     System.out.println("Execution Class (Elements) is running successfully!");
 }
}

