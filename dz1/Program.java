import java.util.Scanner;
 
public class Program {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    float num = in.nextFloat();
    float numT = (num/2)*(num+1);
    int Treagle = (int) numT;
    System.out.printf("Triangular number: %d \n", Treagle);
        in.close();
    }
}
