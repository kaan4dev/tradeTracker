package kc.tradeTracker.business.rules;
import org.springframework.stereotype.Service;
import kc.tradeTracker.core.exceptions.BusinessException;
import kc.tradeTracker.dataAccess.TradeDao;

@Service
public class TradeBusinessRules 
{
	private TradeDao tradeDao;

	
    public TradeBusinessRules(TradeDao tradeDao) 
    {
		super();
		this.tradeDao = tradeDao;
	}


	public void checkIfTradeNameExists(String coinName) 
	{
        if (this.tradeDao.existsByName(coinName)) 
        {
            throw new BusinessException("Brand name already exists");
        }
    }
}
