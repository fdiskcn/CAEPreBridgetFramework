// copyright@gooooloo

package com.qidu.lin.CAE.Pre.Bridge.framework.concrete;

import com.qidu.lin.CAE.Pre.Bridge.framework.Feature;
import com.qidu.lin.CAE.Pre.Bridge.framework.factory.FeatureReaderFactory;
import com.qidu.lin.CAE.Pre.Bridge.framework.factory.FeatureWriterFactory;
import com.qidu.lin.CAE.Pre.Bridge.framework.factory.ForceFactory;

public class ForceFeature extends Feature
{

	private Double x;

	private Double y;
	private Double z;

	public ForceFeature()
	{
		super();
	}

	public Double getX()
	{
		return x;
	}

	public Double getY()
	{
		return y;
	}

	public Double getZ()
	{
		return z;
	}

	@Override
	protected FeatureReaderFactory makeReaderFactory()
	{
		return new ForceFactory(this);
	}

	@Override
	protected FeatureWriterFactory makeWriterFactory()
	{
		return new ForceFactory(this);
	}

	public void setX(Double valueOf)
	{
		// TODO Auto-generated method stub
		this.x = valueOf;
	}

	public void setY(Double valueOf)
	{
		// TODO Auto-generated method stub
		this.y = valueOf;

	}

	public void setZ(Double valueOf)
	{
		// TODO Auto-generated method stub
		this.z = valueOf;

	}

}
