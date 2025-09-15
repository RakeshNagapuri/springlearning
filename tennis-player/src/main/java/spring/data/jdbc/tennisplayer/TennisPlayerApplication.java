package spring.data.jdbc.tennisplayer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spring.data.jdbc.tennisplayer.beans.Player;
import spring.data.jdbc.tennisplayer.dao.PlayerDAO;

import java.util.Date;

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

        logger.info("Inserting new player: {}", playerDAO.insertPlayer(
                new spring.data.jdbc.tennisplayer.beans.Player(5, "Novak Djokovic", "Serbian",
                        new Date(System.currentTimeMillis()), 85)
        ));
        logger.info("All players: {}", playerDAO.getAllPlayers());

        //Inserting a player
        logger.info("Inserting Player 4: {}", playerDAO.insertPlayer(
                new Player(4, "Thiem", "Austria",
                        new Date(System.currentTimeMillis()), 17)));

        //Updating a player
        logger.info("Updating Player with Id 4: {}",  playerDAO.updatePlayer(
                new Player(4, "Thiem", "Austria",
                        new Date(System.currentTimeMillis()), 17)));

        //View player by Id
        logger.info("Players with Id 4: {}", playerDAO.getPlayerById(4));

        //Delete player by Id
        logger.info("Deleting Player with Id 2: {}", playerDAO.deletePlayerById(2));
        logger.info("All Players Data: {}", playerDAO.getAllPlayers());

        //Creating Tournament table
        playerDAO.createTorunamentTable();

        //custom row mapper
        logger.info("Serbian Players: {}", playerDAO.getPlayersByNationality("Serbia"));
    }
}
