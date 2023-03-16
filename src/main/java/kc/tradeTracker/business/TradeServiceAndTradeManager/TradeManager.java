package kc.tradeTracker.business.TradeServiceAndTradeManager;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kc.tradeTracker.business.wants.CreateTradeReq;
import kc.tradeTracker.business.wants.GetAllTradesResponse;
import kc.tradeTracker.business.wants.UpdateTradeReq;
import kc.tradeTracker.core.mapper.ModelMapperService;
import kc.tradeTracker.dataAccess.TradeDao;
import kc.tradeTracker.entities.Trade;

@Service
public class TradeManager implements TradeService
{
	private TradeDao tradeDao;
	private ModelMapperService modelMapperService;
	
	public TradeManager(TradeDao tradeDao,ModelMapperService modelMapperService) 
	{
		super();
		this.tradeDao = tradeDao;
		this.modelMapperService=modelMapperService;
	}

	public List<GetAllTradesResponse> getAll() 
	{
		List<Trade> trades=tradeDao.findAll();
		
		List<GetAllTradesResponse> getAllTradesResponse=trades.stream().map(trade -> this.modelMapperService.forResponse().map(trade, GetAllTradesResponse.class)).collect(Collectors.toList());
		
		return getAllTradesResponse;
	}

	public void add(CreateTradeReq createTradeReq) 
	{
        Trade trade = this.modelMapperService.forRequest().map(createTradeReq, Trade.class);

        this.tradeDao.save(trade);
        
        System.out.println("\ndata named: "+createTradeReq.getName()+" added to the database.");
	}

	public void delete(int id) 
	{
		this.tradeDao.deleteById(id);
		
		System.out.println("\ndata with "+id+" id is deleted succesfully.");
	}

	public void update(UpdateTradeReq updateTradeReq) 
	{
		Trade trade=this.modelMapperService.forRequest().map(updateTradeReq,Trade.class);
		
		this.tradeDao.save(trade);
		
		 System.out.println("\ndata named: "+updateTradeReq.getName()+" is updated.");
	}
	
}
