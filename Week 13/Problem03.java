import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Problem03 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("otherFile");
        FileReader fr = new FileReader("newFile.txt");
        int i = fr.read();
        while (i >= 0) {
            fw.write((char) i);
            i = fr.read();
        }
        fr.close();
        fw.close();
    }
}
