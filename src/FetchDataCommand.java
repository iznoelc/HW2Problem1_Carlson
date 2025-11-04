public class FetchDataCommand implements Command {
    private WeatherDataFetcher fetcher; // initialize a fetcher that fetches the weather data

    public FetchDataCommand(){
        this.fetcher = new WeatherDataFetcher(); // create the instance in the constructor
    }

    /***
     * Simulates fetching data for the hurricane prediction model.
     */
    public void execute(){
        fetcher.fetchData();
    }
}
