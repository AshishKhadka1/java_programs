import java.io.FileInputStream;
import java.io.IOException;

public class MyStream{
    public static void main(String[] args){
        try{
            FileInputStream inputStream = new FileInputStream("C:\\Users\\khadk\\IdeaProjects\\java_programs\\src\\file.txt");
            int data=inputStream.read();
            while(data != -1){
                data= inputStream.read();
                System.out.println(data);
            }
            inputStream.close();
        }catch (IOException e){

        }
    }
}
