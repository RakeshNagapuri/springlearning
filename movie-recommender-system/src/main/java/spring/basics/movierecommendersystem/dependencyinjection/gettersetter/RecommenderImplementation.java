package spring.basics.movierecommendersystem.dependencyinjection.gettersetter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private Filter filter;
    public RecommenderImplementation() {
    }
    public String[] recommendMovies (String movie) {
        //use content based filter to find similar movies
        return this.filter.getRecommendations(movie);
    }
    @Autowired
    @Qualifier("collaborativeFilter")
    public void setFilter(Filter filter) {
        this.filter = filter;
    }
}
