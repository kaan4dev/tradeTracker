package kc.tradeTracker.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kc.tradeTracker.business.serviceAndmanager.TradeService;
import kc.tradeTracker.business.wants.CreateTradeReq;
import kc.tradeTracker.business.wants.GetAllTradesResponse;
import kc.tradeTracker.entities.Trade;

@RestController
@RequestMapping("/api/trade")
public class TradesController 
{
	public TradeService tradeService;

	public TradesController(TradeService tradeService) 
	{
		super();
		this.tradeService = tradeService;
	}
	
	@GetMapping()
    public List<GetAllTradesResponse> getAll()
	{
        return tradeService.getAll();
    }
	
	@PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody() @Valid CreateTradeReq createTradeReq) 
	{
        this.tradeService.add(createTradeReq);
    }
	
	@DeleteMapping("{id}")
    public void delete(@PathVariable int id) 
	{
        this.tradeService.delete(id);
    }
	
}
