package dat3.players.repository;

import dat3.players.entity.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest
class PlayerRepositoryTest {
    @Autowired  //Injecting playerRepository
    private PlayerRepository playerRepository;



    @BeforeEach
    void setUp() {

        playerRepository.save(new Player("XX1", "YY1", "ZZ1"));
        playerRepository.save(new Player("XX2", "YY2", "ZZ2"));
    }

    @Test
    public void testAllPlayers() {
        assertEquals(2, playerRepository.count());
    }

    @Test
    public void testAddPlayer() {
        Player pNew = new Player("XX3", "YY3", "ZZ3");
        playerRepository.save(pNew);
        assertTrue(pNew.getId()>0);
    }


}