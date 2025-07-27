package spring.basics.movierecommendersystem.lesson1;

public class RecommenderImplementation {
    public String[] recommendMovies (String movie) {
        //use content based filter to find similar movies
        ContentBasedFilter contentBasedFilter = new ContentBasedFilter();
        return contentBasedFilter.getRecommendations(movie);
    }
}
