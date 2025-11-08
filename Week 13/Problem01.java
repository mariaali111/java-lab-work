import java.io.File;
import java.io.IOException;

public class Problem01 {
    public static void main(String[] args) throws IOException {
        File f = new File("newFile.txt");
        if (f.createNewFile()) {
            System.out.println("New File created.");
        } else System.out.println("File already exists!");
    }
}
