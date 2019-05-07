package com.lambdaschool.projectrestdogs.exception;

public class ValidationError
{
	private String code;
	private String messgage;

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getMessgage()
	{
		return messgage;
	}

	public void setMessgage(String messgage)
	{
		this.messgage = messgage;
	}
}
