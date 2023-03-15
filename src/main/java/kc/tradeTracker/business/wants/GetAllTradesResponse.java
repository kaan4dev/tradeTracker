package kc.tradeTracker.business.wants;
import lombok.Data;

@Data
public class GetAllTradesResponse
{
	private int id;
	private String name;
	private String longOrShort;
	private int x;
	private long entryPrice;
	private long exitPrice;
	private String entryDate;
	private String exitDate;
	
	public GetAllTradesResponse() 
	{
		super();
	}
	
	public GetAllTradesResponse(int id, String name, String longOrShort, int x, long entryPrice, long exitPrice,String entryDate,String exitDate) 
	{
		super();
		this.id = id;
		this.name = name;
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
	public void setId(int id) {
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
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

	public String getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(String entryDate) {
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
