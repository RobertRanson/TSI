import java.util.ArrayList;
import java.util.List;

public class TestOutput extends Output{
    protected List<String> testOutputs = new ArrayList<String>(10);

    public List<String> getTestOutputs(){
        return testOutputs;
    }

    public void clear(){
        testOutputs.clear();
    }
    public void output(String display){
        testOutputs.add(display);
    }
    public void output(List<String> displayOutput){
        for (String display : displayOutput){
            testOutputs.add(display);
        }
    }

    public String toString(){
        String result = "";
        for (String message : testOutputs){
            result += message;
        }
        return result;
    }

}