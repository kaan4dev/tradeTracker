package kc.tradeTracker.business.TradeServiceAndTradeManager;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import kc.tradeTracker.business.rules.TradeBusinessRules;
import kc.tradeTracker.business.wants.CreateTradeReq;
import kc.tradeTracker.business.wants.GetAllTradesResponse;
import kc.tradeTracker.core.mapper.ModelMapperService;
import kc.tradeTracker.dataAccess.TradeDao;
import kc.tradeTracker.entities.Trade;

@Service
public class TradeManager implements TradeService
{
	private TradeDao tradeDao;
	private ModelMapperService modelMapperService;
	private TradeBusinessRules tradeBusinessRules;
	
	public TradeManager(TradeDao tradeDao,ModelMapperService modelMapperService,TradeBusinessRules tradeBusinessRules) 
	{
		super();
		this.tradeDao = tradeDao;
		this.modelMapperService=modelMapperService;
		this.tradeBusinessRules=tradeBusinessRules;
	}

	public List<GetAllTradesResponse> getAll() 
	{
		List<Trade> trades=tradeDao.findAll();
		
		List<GetAllTradesResponse> getAllTradesResponse=trades.stream().map(trade -> this.modelMapperService.forResponse().map(trade, GetAllTradesResponse.class)).collect(Collectors.toList());
		
		return getAllTradesResponse;
	}

	public void add(CreateTradeReq createTradeReq) 
	{
		this.tradeBusinessRules.checkIfTradeNameExists(createTradeReq.getCoinName());

        Trade trade = this.modelMapperService.forRequest().map(createTradeReq, Trade.class);

        this.tradeDao.save(trade);
	}

	public void delete(int id) 
	{
		this.tradeDao.deleteById(id);
	}
	
}
