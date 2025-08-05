package spring.basics.movierecommendersystem.beanscope.prototype;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // This indicates that a new instance of this bean will be created each time it is requested
@Qualifier("collaborativeFilter")
public class CollaborativeFilter implements Filter {
    public CollaborativeFilter() {
        System.out.println("CollaborativeFilter constructor");
        // Default constructor
    }
    public String[] getRecommendations(String movie) {
        //logic of collaborative filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
