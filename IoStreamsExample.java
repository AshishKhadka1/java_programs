import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class IoStreamsExample {
    public static void main(String args[]) throws IOException{
        File file = new File("C:\\Users\\khadk\\IdeaProjects\\java_programs\\src\\IoStreamsExample.java");
        FileReader reader = new FileReader(file);
        char chars[] = new char[(int) file.length()];
        reader.read(chars);
        File out = new File("C:\\Users\\khadk\\IdeaProjects\\java_programs\\src\\IoStreamsExample.java");
        FileWriter writer = new FileWriter(out);
        writer.write(chars);
        writer.flush();
        System.out.println("DATA SUCCESSFULLY WRITTEN");
    }
}
