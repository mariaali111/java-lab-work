import java.io.FileReader;
import java.io.IOException;

public class Problem04 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("newFile.txt");
        int count = 0;
        int i = fr.read();
        while (i >= 0) {
            count++;
            i = fr.read();
        }
        fr.close();
        System.out.println("number of characters = " + count);
    }
}
