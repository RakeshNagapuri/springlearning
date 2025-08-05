package spring.basics.movierecommendersystem.beanscope.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // This indicates that a new instance of this bean will be created each time it is requested
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
