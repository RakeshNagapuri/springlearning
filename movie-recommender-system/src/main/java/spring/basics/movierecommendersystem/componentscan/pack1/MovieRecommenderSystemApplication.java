package spring.basics.movierecommendersystem.componentscan.pack1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import spring.basics.movierecommendersystem.componentscan.pack3.RecommenderImplementation;


@SpringBootApplication
//@ComponentScan(basePackages = {"spring.basics.movierecommendersystem.componentscan.pack2",
 //       "spring.basics.movierecommendersystem.componentscan.pack3"})
 @ComponentScan(includeFilters = @ComponentScan.Filter (type= FilterType.REGEX,
 pattern="spring.basics.movierecommendersystem.componentscan.*"))
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
        RecommenderImplementation recommender1 = appContext.getBean(RecommenderImplementation.class);

        System.out.println("Recommender 1: " + recommender1);

    }

}
