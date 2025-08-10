package assignment_week1_day2;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first_num= 0;
        int second_num = 1;
        int range = 8;

        System.out.print("Fibonacci Series: ");
        
        // Print first two numbers
        System.out.print(first_num + ", " + second_num);
        
        // Loop for remaining numbers
        for (int i = 2; i < range; i++) {
        int next = first_num + second_num;
        System.out.print(", " + next);
        first_num = second_num;
        second_num = next;

	}

}
}






		        
        