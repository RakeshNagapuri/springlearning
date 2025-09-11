package spring.basics.movierecommendersystem.componentscan.pack2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") // This is the default scope, so it's optional
@Qualifier("contentBasedFilter") // This allows you to specify this filter when using @Qualifier in the RecommenderImplementation
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
