package kc.tradeTracker.business.serviceAndmanager;

import java.util.List;

import kc.tradeTracker.business.wants.CreateTradeReq;
import kc.tradeTracker.business.wants.GetAllTradesResponse;

public interface TradeService 
{
	List<GetAllTradesResponse> getAll();
	
	void add(CreateTradeReq createTradeReq);
	
	void delete(int id);
	
}
