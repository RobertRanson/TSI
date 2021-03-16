public class Main {

    private Output output;
    private Input input;
    private Input random;

    Main(){
        this(new ConsoleOutput(),new ConsoleInput(),new RandomInput());
    }

    Main(Output output ,Input input, Input random){
        this.output = output;
        this.input = input;
        this.random = random;
    }

    private void close(){
        random.close();
        output.close();
        input.close();
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    public void setRandom(Input random) {
        this.random = random;
    }

    public Output getOutput() {
        return output;
    }

    protected void play(){
        int result = 0;

        output.output("Please guess a random number, enter a larger number to stop");
        do {
            int computerNumber = random.getInputInt();
            output.output("Please guess a number from 0 to " + random.getMaxNumber());
            result = input.getInputInt();
            if (result == computerNumber ) {
                output.output("Correct");
            } else if (result < random.getMaxNumber()) {
                output.output("Wrong");
            }

        } while (result <= random.getMaxNumber());
        close();
    }

    public static void main(String[] args){
        Main main = new Main();
        main.play();
    }
}
