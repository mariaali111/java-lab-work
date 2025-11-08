import java.io.FileReader;
import java.io.IOException;

public class Problem02 {

    public static void main(String[] args) {
        try {
            firstFunction();
        } catch (IOException e) {
            System.out.println("File not found or cannot be opened.");
        }
        System.out.println("Rest of the code...");
    }

    public static void firstFunction() throws IOException {
        secondFunction();
    }

    public static void secondFunction() throws IOException {
        thirdFunction();
    }

    public static void thirdFunction() throws IOException {
        FileReader file = new FileReader("nonexistent.txt");
        file.close();
    }
}
