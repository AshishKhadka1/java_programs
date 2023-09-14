import java.io.*;

public class  FileIOExampe{
    public static void main(String[] args) {
        // File to read from
        String inputFile = "input.txt";
        // File to write to
        String outputFile = "output.txt";

        try {
            // Create a FileReader and FileWriter
            FileReader reader = new FileReader(inputFile);
            FileWriter writer = new FileWriter(outputFile);

            // Using character streams
            int character;
            while ((character = reader.read()) != -1) {
                // Write the character to the output file
                writer.write(character);
            }

            // Close the streams
            reader.close();
            writer.close();

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
