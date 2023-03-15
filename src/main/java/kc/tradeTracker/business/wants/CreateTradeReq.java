package kc.tradeTracker.business.wants;
import lombok.Data;

@Data
public class CreateTradeReq 
{
	private int id;
	
	private String coinName;
	
	private String longOrShort;
	
	private int x;
	
	private long entryPrice;
	
	private long exitPrice;
	
	private String entryDate;
	
	private String exitDate;

	public CreateTradeReq() 
	{
		super();
	}

	public CreateTradeReq(int id, String coinName, String longOrShort, int x, long entryPrice, long exitPrice,String entryDate,String exitDate) 
	{
		super();
		this.id = id;
		this.coinName = coinName;
		this.longOrShort = longOrShort;
		this.x = x;
		this.entryPrice = entryPrice;
		this.exitPrice = exitPrice;
		this.entryDate=entryDate;
		this.exitDate=exitDate;
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

	public int getX() 
	{
		return x;
	}

	public void setX(int x) 
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

	public String getEntryDate() 
	{
		return entryDate;
	}

	public void setEntryDate(String entryDate) 
	{
		this.entryDate = entryDate;
	}

	public String getExitDate() 
	{
		return exitDate;
	}

	public void setExitDate(String exitDate) 
	{
		this.exitDate = exitDate;
	}

}
