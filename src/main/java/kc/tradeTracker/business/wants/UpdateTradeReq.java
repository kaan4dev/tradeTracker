package kc.tradeTracker.business.wants;

public class UpdateTradeReq
{
	private int id;
	
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
	
	public UpdateTradeReq() 
	{
		super();
	}

	public UpdateTradeReq(int id, String name, String longOrShort, int x, double entryPrice, double exitPrice,double averagePrice,String entryDate, String exitDate, double margin, double profitLoss) 
	{
		this.id = id;
		this.name = name;
		this.longOrShort = longOrShort;
		this.x = x;
		this.entryPrice = entryPrice;
		this.exitPrice = exitPrice;
		this.averagePrice=averagePrice;
		this.entryDate = entryDate;
		this.exitDate = exitDate;
		this.margin = margin;
		this.profitLoss = profitLoss;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
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
