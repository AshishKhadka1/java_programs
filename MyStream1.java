import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyStream1 {
    public static void main(String[] args){
        try{
            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\khadk\\IdeaProjects\\java_programs\\src\\FILE1.txt");
            outputStream.write("HELLO WORLD!".getBytes());
            outputStream.close();
            System.out.println("File has been written successfully.");


        }catch (IOException e){
            // Handle the exception
        }
    }
}
