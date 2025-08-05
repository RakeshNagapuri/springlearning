package spring.basics.movierecommendersystem.beanscope.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
        RecommenderImplementation recommender1 = appContext.getBean(RecommenderImplementation.class);
        RecommenderImplementation recommender2 = appContext.getBean(RecommenderImplementation.class);
        RecommenderImplementation recommender3 = appContext.getBean(RecommenderImplementation.class);

        System.out.println("Recommender 1: " + recommender1);
        System.out.println("Recommender 2: " + recommender2);
        System.out.println("Recommender 3: " + recommender3);

    }

}
