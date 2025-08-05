package spring.basics.movierecommendersystem.fieldinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Qualifier("contentBasedFilter")
    @Autowired
    private Filter filter;
    public RecommenderImplementation() {
    }
    public String[] recommendMovies (String movie) {
        //use content based filter to find similar movies
        return this.filter.getRecommendations(movie);
    }
}
