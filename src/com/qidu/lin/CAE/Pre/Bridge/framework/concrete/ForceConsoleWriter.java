// copyright@gooooloo

package com.qidu.lin.CAE.Pre.Bridge.framework.concrete;

import com.qidu.lin.CAE.Pre.Bridge.framework.FeatureWriter;

public class ForceConsoleWriter implements FeatureWriter
{
	public ForceConsoleWriter(ForceFeature force)
	{
		super();
		this.force = force;
	}

	final ForceFeature force;

	@Override
	public void write()
	{
		System.out.print(force.getX());
		System.out.print(",");
		System.out.print(force.getY());
		System.out.print(",");
		System.out.print(force.getZ());
		System.out.println();
	}

}
