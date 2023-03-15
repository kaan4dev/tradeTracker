package kc.tradeTracker.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="mytrades")
@Entity
public class Trade 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="longOrShort")
	private String longOrShort;
	
	@Column(name="x")
	private int x;
	
	@Column(name="entryPrice")
	private long entryPrice;
	
	@Column(name="exitPrice")
	private long exitPrice;
	
	@Column(name="entryDate")
	private String entryDate;

	@Column(name="exitDate")
	private String exitDate;

	public Trade()
	{
	}

	public Trade(int id, String name, String longOrShort, int x,long entryPrice, long exitPrice,String entryDate,String exitDate) 
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

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setCoinName(String name) 
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
