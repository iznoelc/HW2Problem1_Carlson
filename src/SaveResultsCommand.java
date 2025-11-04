public class SaveResultsCommand implements Command {
    private ResultSaver resultSaver; // initialize a result saver that saves the results of a hurricane prediction model

    public SaveResultsCommand(){
        this.resultSaver = new ResultSaver(); // instantiate the result saver in the constructor
    }

    /**
     * Simulates the post-processing/saving of a hurricane prediction model.
     */
    public void execute(){
        resultSaver.postProcessResults();
    }
}
