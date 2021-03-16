import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile {

    private List<String> readList(String fileName){
        List<String> rawData = new ArrayList<String>();
        try {
            File file = new File("src/main/resources/" + fileName);
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                rawData.add(fileReader.nextLine());
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return rawData;
    }
}
