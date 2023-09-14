import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CorePackagesDemo {
    public static void main(String[] args) {
        // Using java.lang package
        String message = "Hello, World!";
        System.out.println("Message from java.lang: " + message);

        // Using java.util package
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Names from java.util: " + names);

        // Using java.io package
        try {
            File file = new File("output.txt");
            FileWriter writer = new FileWriter(file);
            writer.write("This is a text file created using java.io package.");
            writer.close();
            System.out.println("File created successfully: " + file.getName());
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
