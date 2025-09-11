package spring.data.jdbc.tennisplayer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spring.data.jdbc.tennisplayer.dao.PlayerDAO;

@SpringBootApplication
public class TennisPlayerApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(TennisPlayerApplication.class);
    @Autowired
    private PlayerDAO playerDAO;

    public static void main(String[] args) {
        SpringApplication.run(TennisPlayerApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        logger.info("All players: {}", playerDAO.getAllPlayers());
        logger.info("Player with ID 1: {}", playerDAO.getPlayerById(1));
    }
}
