package spring.basics.movierecommendersystem.lesson3_primaryannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private Filter filter;
    @Autowired // Use of this annotation is optional when using constructor injection
    public RecommenderImplementation(@Qualifier("contentBasedFilter") Filter filter) {
        // Use @Qualifier to specify which filter to use, it overrides the default @Primary filter
        this.filter = filter;
    }
    public String[] recommendMovies (String movie) {
        //use content based filter to find similar movies
        return this.filter.getRecommendations(movie);
    }
}
