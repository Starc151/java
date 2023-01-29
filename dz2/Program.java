import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {
    public static void main(String[] args) throws IOException {
        int mult = multiplication(readFile());
        writerFile(Integer.toString(mult));
    }
    public static String[] readFile() throws FileNotFoundException {
        File fl = new File("dz2/input.txt");
        Scanner sc = new Scanner(fl);
        String[] res = new String[2];
        for (int i = 0; sc.hasNextLine(); i++) {
            res[i] = sc.nextLine();
        }
        sc.close();
        return res;
    }
    public static int multiplication(String[] inArr){
        int a = 0;
        int b = 0;
        for (int i = 0; i < inArr.length; i++) {
            if (inArr[i].contains("a")) {
                a = getIntFromString(inArr[i]);
            } else if(inArr[i].contains("b")){
                b = getIntFromString(inArr[i]);
            }
        }
        return (int) Math.pow(a, b);
    }
    public static int getIntFromString(String s) {
        Pattern pat = Pattern.compile("[-]?[0-9]+(.[0-9]+)?");
        Matcher matcher = pat.matcher(s);
        int res = 0;
        while (matcher.find()) {
            res = Integer.parseInt (matcher.group());
        };
        return res;
    }
    public static void writerFile(String s) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("dz2/output.txt"));
        writer.write(s);
        writer.close();
}
}
