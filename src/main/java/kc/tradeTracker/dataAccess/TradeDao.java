package kc.tradeTracker.dataAccess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import kc.tradeTracker.entities.Trade;

@Repository
public interface TradeDao extends JpaRepository<Trade,Integer>
{
	boolean existsByName(String name);
}
