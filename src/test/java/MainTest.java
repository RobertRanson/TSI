import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main getMainTest(TestOutput testOutput){
        ReadFromFile readFromFile = new ReadFromFile();
        TestInput testInput = new TestInput();
        List<String> recordedInput = readFromFile.readList("ConsoleInput.csv");
        testInput.setTestInputs(recordedInput);
        TestInput randTestInput = new TestInput();
        randTestInput.setTestInputs(readFromFile.readList("RandomInput.csv"));
        Main newMain = new Main(testOutput, testInput, randTestInput);
        return newMain;
    }

    @Test
    void play() {
        //Open the file reader
        ReadFromFile readFromFile = new ReadFromFile();
        //Create new TestOutput object
        TestOutput testOutput = new TestOutput();
        //List of the console recorded outputs
        List<String> recordedOutput = readFromFile.readList("ConsoleOutput.csv");
        //Get an instance of main with "ConsoleInput.csv", "RandomInput.csv" and the TestOutput
        Main testMain = getMainTest(testOutput);
        //Call the play method.
        //The game will now write the output to the TestOutput instead of the console.
        testMain.play();

        System.out.println(recordedOutput);
        System.out.println(testOutput.getTestOutputs());
        //We now check the original console output with the new Test output.
        assertEquals(recordedOutput,testOutput.getTestOutputs());
    }

}