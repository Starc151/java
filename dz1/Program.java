import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        getTriangularNumber();
    }

    public static int inputNum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        return num;
    }

    public static int calcTriangularNumber(float num){
        int result = Math.round((num/2)*(num+1));
        return result; 

    }

    public static void getTriangularNumber(){
        int num = inputNum();
        num = calcTriangularNumber(num);
        System.out.printf("Triangular number: %d \n", num);
    }
}

