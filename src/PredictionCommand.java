public class PredictionCommand implements Command {
    private PredictionModel predictionModel; // initialize a predictor used to apply the hurricane prediction model

    public PredictionCommand(){
        this.predictionModel = new PredictionModel(); // instantiate a prediction model
    }

    /**
     * Executes the applyPredictionModel command, simulating applying a hurricane prediction model.
     */
    public void execute(){
        predictionModel.applyPredictionModel();
    }
}
