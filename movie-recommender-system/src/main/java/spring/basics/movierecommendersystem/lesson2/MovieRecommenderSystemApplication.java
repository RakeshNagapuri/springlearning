package spring.basics.movierecommendersystem.lesson2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        //SpringApplication.run(MovieRecommenderSystemApplication.class, args);
        RecommenderImplementation recommenderImplementation = new RecommenderImplementation(new CollaborativeFilter());
        String[] result = recommenderImplementation.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(result));
    }

}
