package kc.tradeTracker.business.wants;
import lombok.Data;

@Data
public class CreateTradeReq 
{
	
	private String name;
	
	private double entryPrice;
	
	private double exitPrice;
	
	private double averagePrice;
	
	private int x;
	
	private double margin;
	
	private String longOrShort;

	private String entryDate;
	
	private String exitDate;
	
	private double profitLoss;

	public CreateTradeReq() 
	{
		super();
	}
	
	

	public CreateTradeReq(String name, double entryPrice, double exitPrice, double averagePrice, int x,double margin, String longOrShort, String entryDate, String exitDate, double profitLoss) 
	{
		this.name = name;
		this.entryPrice = entryPrice;
		this.exitPrice = exitPrice;
		this.averagePrice = averagePrice;
		this.x = x;
		this.margin = margin;
		this.longOrShort = longOrShort;
		this.entryDate = entryDate;
		this.exitDate = exitDate;
		this.profitLoss = profitLoss;
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
	
	public double getEntryPrice() 
	{
		return entryPrice;
	}
	
	public void setEntryPrice(double entryPrice) 
	{
		this.entryPrice = entryPrice;
	}

	public double getExitPrice() 
	{
		return exitPrice;
	}

	public void setExitPrice(double exitPrice) 
	{
		this.exitPrice = exitPrice;
	}

	public double getAveragePrice() 
	{
		return averagePrice;
	}
	
	public void setAveragePrice(double averagePrice) 
	{
		this.averagePrice = averagePrice;
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

	public double getMargin() 
	{
		return margin;
	}

	public void setMargin(double margin) 
	{
		this.margin = margin;
	}

	public double getProfitLoss() 
	{
		return profitLoss;
	}
	
	public void setProfitLoss(double profitLoss) 
	{
		this.profitLoss = profitLoss;
	}
}
