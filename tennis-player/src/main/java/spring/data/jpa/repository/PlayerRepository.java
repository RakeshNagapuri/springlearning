package spring.data.jpa.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import spring.data.jpa.entity.Player;

import java.util.List;

@Repository
@Transactional
public class PlayerRepository {
    @PersistenceContext
    EntityManager entityManager;

    public Player insertPlayer(Player player) {
        return entityManager.merge(player);
    }
    public Player getPlayerById(int id) {
        return entityManager.find(Player.class, id);
    }
    public Player updatePlayer(Player player) {
        return entityManager.merge(player);
    }
    public void deletePlayerById(int id) {
        Player player = getPlayerById(id);
        entityManager.remove(player);
    }
    public List<Player> getAllPlayers() {
        return entityManager.createNamedQuery("get_all_players", Player.class).getResultList();
    }

}
