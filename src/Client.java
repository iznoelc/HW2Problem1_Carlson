/**
 * Test cases for machine learning & statistical hurricane prediction models (template pattern)
 * Test case for hurricane predictor steps through the invoker (command pattern)
 */
public class Client {
    public static void main(String[] args){
        // Test machine learning prediction model
        System.out.println("---ML PREDICTION MODEL---");
        HurricanePredictionTemplate mlModel = new MachineLearningPrediction();

        mlModel.predictHurricane();
        System.out.println();

        // Test statistical prediction model
        System.out.println("---STAT PREDICTION MODEL---");
        HurricanePredictionTemplate statModel = new StatisticalPrediction();

        statModel.predictHurricane();
        System.out.println();

        // Test prediction using commands
        System.out.println("---COMMAND PREDICTION---");

        PredictionInvoker predictionInvoker = new PredictionInvoker();
        predictionInvoker.addCommand(new FetchDataCommand());
        predictionInvoker.addCommand(new PredictionCommand());
        predictionInvoker.addCommand(new SaveResultsCommand());

        predictionInvoker.executeCommands();
    }
}