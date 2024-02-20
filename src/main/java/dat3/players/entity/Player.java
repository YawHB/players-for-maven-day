package dat3.players.entity;
import jakarta.persistence.*;


@Entity
@Table(name = "spiller")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "spiller_navn", length = 50, nullable = false)
    private String name;
    String country;
    String position;
    public  Player(String name, String country, String position) {
        this.name = name;
        this.country = country;
        this.position = position;
    }

    public Player() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
