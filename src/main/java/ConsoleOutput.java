public class ConsoleOutput extends Output{

    private String className = ConsoleOutput.class.getName();

    public ConsoleOutput() {
        if (writeToFile) {
            fileWritter = new WriteToFile(className + ".csv");
        }
    }

    @Override
    public void output(String message) {
        System.out.println(message);
        this.store(message);
    }
}
