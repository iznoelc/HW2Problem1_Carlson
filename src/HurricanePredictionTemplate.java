/**
 * Creates a template for hurricane prediction models (i.e. statistical, machine learning) to follow.
 */
public abstract class HurricanePredictionTemplate {
    public abstract void fetchData();
    public abstract void preprocessData();
    public abstract void applyPredictionModel();
    public abstract void postProcessResults();

    /***
     * Calls each step of the hurricane prediction model in order to simulate predicting a hurricane.
     */
    public void predictHurricane(){
        fetchData();
        preprocessData();
        applyPredictionModel();
        postProcessResults();
    }
}
