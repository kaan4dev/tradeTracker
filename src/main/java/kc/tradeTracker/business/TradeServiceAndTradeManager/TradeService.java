package kc.tradeTracker.business.TradeServiceAndTradeManager;
import java.util.List;
import kc.tradeTracker.business.wants.CreateTradeReq;
import kc.tradeTracker.business.wants.GetAllTradesResponse;
import kc.tradeTracker.business.wants.UpdateTradeReq;

public interface TradeService 
{
	List<GetAllTradesResponse> getAll();
	
	void add(CreateTradeReq createTradeReq);
	
	void delete(int id);
	
	void update(UpdateTradeReq updateTradeReq);
	
}
