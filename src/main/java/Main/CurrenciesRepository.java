package Main;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CurrenciesRepository extends CrudRepository<Currencies, Integer> {

    @Query("SELECT coalesce(max(c.id), 0) FROM Currencies c")
    Integer getMaxId();
}
