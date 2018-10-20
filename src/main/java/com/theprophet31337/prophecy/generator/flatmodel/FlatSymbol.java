package com.theprophet31337.prophecy.generator.flatmodel;

public class FlatSymbol
{
	private String name;
	private String type;

	public FlatSymbol(String name, String type)
	{
		this.name = name;
		this.type = type;
	}

	public String getName()
	{
		return name;
	}

	public String getType()
	{
		return type;
	}
}
