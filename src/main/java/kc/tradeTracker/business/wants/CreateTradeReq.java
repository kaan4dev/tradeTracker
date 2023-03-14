package kc.tradeTracker.business.wants;
import lombok.Data;

@Data
public class CreateTradeReq 
{
	private int id;
	
	private String coinName;
	
	private String longOrShort;
	
	private String x;
	
	private long entryPrice;
	
	private long exitPrice;

	public CreateTradeReq() 
	{
		super();
	}

	public CreateTradeReq(int id, String coinName, String longOrShort, String x, long entryPrice, long exitPrice) 
	{
		super();
		this.id = id;
		this.coinName = coinName;
		this.longOrShort = longOrShort;
		this.x = x;
		this.entryPrice = entryPrice;
		this.exitPrice = exitPrice;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getCoinName() 
	{
		return coinName;
	}

	public void setCoinName(String coinName) 
	{
		this.coinName = coinName;
	}

	public String getLongOrShort() 
	{
		return longOrShort;
	}

	public void setLongOrShort(String longOrShort) 
	{
		this.longOrShort = longOrShort;
	}

	public String getX() 
	{
		return x;
	}

	public void setX(String x) 
	{
		this.x = x;
	}

	public long getEntryPrice() 
	{
		return entryPrice;
	}

	public void setEntryPrice(long entryPrice) 
	{
		this.entryPrice = entryPrice;
	}

	public long getExitPrice() 
	{
		return exitPrice;
	}

	public void setExitPrice(long exitPrice) 
	{
		this.exitPrice = exitPrice;
	}
	
}
