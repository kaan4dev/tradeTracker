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
	private String x;
	
	@Column(name="entryPrice")
	private long entryPrice;
	
	@Column(name="exitPrice")
	private long exitPrice;

	public Trade() 
	{
	}

	public Trade(int id, String name, String longOrShort, String x,long entryPrice, long exitPrice) 
	{
		super();
		this.id = id;
		this.name = name;
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
