package spring.basics.movierecommendersystem.lesson3_primaryannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
        // Use the recommender to get movie recommendations
        String[] result = recommender.recommendMovies("Finding Dory");
        // Print the recommended movies
        System.out.println("Recommended movies are: " + Arrays.toString(result));
    }

}
