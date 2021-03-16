import java.util.ArrayList;
import java.util.List;

public abstract class Output extends Display{

    public abstract void output(String message);

    public List<String> getOutputs(){
        List<String> output = new ArrayList<String>();
        return output;
    }
}
