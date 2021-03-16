public class Main {

    private Output output = new ConsoleOutput();
    private Input input = new ConsoleInput();
    private RandomInput random = new RandomInput();

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

    public void setRandom(RandomInput random) {
        this.random = random;
    }

    private void play(){
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
