package spring.basics.movierecommendersystem.componentscan.pack2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") // This is the default scope, so it's optional
@Qualifier("collaborativeFilter") // This allows you to specify this filter when using @Qualifier in the RecommenderImplementation
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
