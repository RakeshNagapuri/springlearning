package spring.basics.movierecommendersystem.beanscope.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") // This indicates that a single instance of this bean will be created and shared
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
