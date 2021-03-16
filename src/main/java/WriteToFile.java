import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    private FileWriter fileWriter;

    WriteToFile(String fileName){
        try {
            fileWriter = new FileWriter("src/main/resources/" + fileName);
        } catch (IOException exp) {
            exp.printStackTrace();
        }
    }
    public void write(String message){
        try {
            fileWriter.write(message +"\n");
        } catch (IOException exp) {
            exp.printStackTrace();
        }
    }

    public void close(){
        try {
            fileWriter.close();
        } catch (IOException exp) {
            exp.printStackTrace();
        }
    }
}
