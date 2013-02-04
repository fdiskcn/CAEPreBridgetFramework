// copyright@gooooloo

package com.qidu.lin.CAE.Pre.Bridge.framework.concrete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.qidu.lin.CAE.Pre.Bridge.framework.FeatureReader;

public class ForceConsoleReader implements FeatureReader
{

	final ForceFeature force;

	public ForceConsoleReader(ForceFeature f)
	{
		this.force = f;
	}

	@Override
	public void read()
	{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			force.setX(Double.valueOf(x.readLine()));
			force.setY(Double.valueOf(x.readLine()));
			force.setZ(Double.valueOf(x.readLine()));
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
