import java.util.ArrayList;
import java.util.List;

public class TestOutput extends Output{
    private List<String> testOutputs = new ArrayList<String>(10);

    public void setTestOutputs(List<String> outputs){
        testOutputs = outputs;
    }

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
}