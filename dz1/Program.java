import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        getTriangularNumber();
    }

    public static int inputNum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number greater than 0: ");
        if (!in.hasNextInt()) {
            System.out.println("You didn't enter a number");
            System.exit(0);
        }
        int num = in.nextInt();
        if (num <=0) {
            System.out.println("You entered a number less than 0");
            System.exit(0);
        }
        return num;
    }

    public static int calcTriangularNumber(int num){
        return (num*(num+1))/2;
    }

    public static void getTriangularNumber(){
        int num = inputNum();
        num = calcTriangularNumber(num);
        System.out.printf("Triangular number: %d \n", num);
    }
}

