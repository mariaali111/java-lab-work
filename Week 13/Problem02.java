import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("newFile.txt");
        System.out.print("Text: ");
        String text = sc.nextLine();
        fw.write(text);
        fw.close();
    }
}
