import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\khadk\\IdeaProjects\\java_programs\\src\\Output.txt");
        BufferedReader br = new BufferedReader(fr);
        char c[] = new char[20];

        if (br.markSupported()) {
            System.out.println("mark() method is supported");
            br.mark(100); // Changed mark limit to 100
        }

        br.skip(8);

        if (br.ready()) {
            System.out.println(br.readLine());
            int bytesRead = br.read(c);
            for (int i = 0; i < bytesRead; i++) { // Changed condition to < bytesRead
                System.out.print(c[i]);
            }
            System.out.println();
            br.reset();
            for (int i = 0; i < 8; i++) { // Changed condition to < 8
                System.out.println((char) br.read());
            }
        }

        br.close();
        fr.close();
    }
}