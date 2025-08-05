package spring.basics.movierecommendersystem.beanscope.mixedscopewithproxy;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Getter
@Component
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode= ScopedProxyMode.TARGET_CLASS)
// This indicates that the bean is a prototype, meaning a new instance will be created each time it is requested
// The proxyMode=ScopedProxyMode.TARGET_CLASS creates a proxy for the bean, allowing it to be injected into singleton beans
// This is useful when you want to use a prototype bean in a singleton bean, as it allows the singleton to reference the prototype bean without creating a new instance every time it is accessed.
// The proxy will handle the creation of a new instance of the prototype bean when it is accessed
@Qualifier("contentBasedFilter")
// This indicates that a new instance of this bean will be created each time it is requested
public class ContentBasedFilter implements Filter {
    private static int instances = 0;
    @Autowired
    private Movie movie;
    public ContentBasedFilter(){
        instances++;
        System.out.println("ContentBasedFilter constructor");
        // Default constructor
    }
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
    public static int getInstances() {
        return ContentBasedFilter.instances;
    }
}
