package spring.basics.movierecommendersystem.beanscope.prototype;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Qualifier("contentBasedFilter")
// This indicates that a new instance of this bean will be created each time it is requested
public class ContentBasedFilter implements Filter {
    public ContentBasedFilter(){
        System.out.println("ContentBasedFilter constructor");
        // Default constructor
    }
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
