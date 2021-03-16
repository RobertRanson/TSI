import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReadFromFileTest {
    ReadFromFile readFromFile = new ReadFromFile();

    @Test
    void readList() {
        List<Integer> result = new ArrayList<Integer>();
        result.add(3);
        result.add(4);
        result.add(8);
        assertEquals(result.toString(),readFromFile.readList("ConsoleInput.csv").toString());
    }
}