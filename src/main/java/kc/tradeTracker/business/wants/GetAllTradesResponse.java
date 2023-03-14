package kc.tradeTracker.business.wants;
import lombok.Data;

@Data
public class GetAllTradesResponse
{
	private int id;
	private String name;
	
	public GetAllTradesResponse() 
	{
		super();
	}
	
	public GetAllTradesResponse(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
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
}
