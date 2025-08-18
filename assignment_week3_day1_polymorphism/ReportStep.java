package assignment_week3_day1_polymorphism;

public class ReportStep {

    public void reportStep(String msg, String status) {
        System.out.println("Message: " + msg + " | Status: " + status);
    }

    public void reportStep(String msg, String status, boolean snap) {
    System.out.println("Message: " + msg + " | Status: " + status + " | Snapshot Taken: " + snap);
    }
    public static void main(String[] args) {
      ReportStep step = new ReportStep();
      step.reportStep("Login Successful", "PASS");
      step.reportStep("Login Failed", "FAIL", true);
    }
}
