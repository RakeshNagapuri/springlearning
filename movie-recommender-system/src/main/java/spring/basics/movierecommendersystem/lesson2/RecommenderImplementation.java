package spring.basics.movierecommendersystem.lesson2;

public class RecommenderImplementation {
    private Filter filter;
    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }
    public String[] recommendMovies (String movie) {
        //use content based filter to find similar movies
        return this.filter.getRecommendations(movie);
    }
}
