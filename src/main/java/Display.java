public class Display {
    protected boolean writeToFile = true;
    protected WriteToFile fileWritter;
    protected String className = Input.class.getName();

    public Display(){
        if (writeToFile) {
            fileWritter = new WriteToFile(className + ".csv");
        }
    }

    protected void store(String message){
        if (writeToFile){
            fileWritter.write(message);
        }
    }

    public void setWriteToFile(boolean writeToFile) {
        this.writeToFile = writeToFile;
    }

    public void close(){
        this.fileWritter.close();
    }
}
