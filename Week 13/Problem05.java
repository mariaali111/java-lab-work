import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem05 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("newFile.txt");
        BufferedReader br = new BufferedReader(fr);
        int count = 0;
        String s = br.readLine();
        while (s != null) {
            count++;
            s = br.readLine();
        }
        br.close();
        fr.close();
        System.out.println("number of lines = " + count);
    }
}
