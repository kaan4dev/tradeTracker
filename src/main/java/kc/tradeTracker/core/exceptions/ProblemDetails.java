package kc.tradeTracker.core.exceptions;

public class ProblemDetails
{
	String message;
	
	public ProblemDetails() 
	{
		super();
	}

	public ProblemDetails(String message) 
	{
		super();
		this.message = message;
	}

	public String getMessage() 
	{
		return message;
	}

	public void setMessage(String message) 
	{
		this.message = message;
	}
}
