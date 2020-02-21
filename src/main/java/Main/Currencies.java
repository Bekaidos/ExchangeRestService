package Main;

import java.time.LocalDateTime;
import javax.persistence.*;

@Entity

public class Currencies {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private LocalDateTime date_insert = LocalDateTime.now();
   // @Column(name="_valueUSD")
    private Double USD;
   // @Column(name="_eur")
    private Double EUR;
   // @Column(name="_rub")
    private Double RUB;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDate_insert() {
        return date_insert;
    }

    public Double getUSD() {
        return USD;
    }

    public void setUSD(Double USD) {
        this.USD = USD;
    }

    public Double getEUR() {
        return EUR;
    }

    public void setEUR(Double EUR) {
        this.EUR = EUR;
    }

    public Double getRUB() {
        return RUB;
    }

    public void setRUB(Double RUB) {
        this.RUB = RUB;
    }

}
