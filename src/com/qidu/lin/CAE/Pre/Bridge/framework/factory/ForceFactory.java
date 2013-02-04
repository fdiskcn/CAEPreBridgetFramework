// copyright@gooooloo

package com.qidu.lin.CAE.Pre.Bridge.framework.factory;

import java.io.OutputStream;

import com.qidu.lin.CAE.Pre.Bridge.framework.FeatureReader;
import com.qidu.lin.CAE.Pre.Bridge.framework.FeatureWriter;
import com.qidu.lin.CAE.Pre.Bridge.framework.concrete.ForceConsoleReader;
import com.qidu.lin.CAE.Pre.Bridge.framework.concrete.ForceConsoleWriter;
import com.qidu.lin.CAE.Pre.Bridge.framework.concrete.ForceFeature;

public class ForceFactory implements FeatureReaderFactory, FeatureWriterFactory
{
	final ForceFeature force;

	public ForceFactory(ForceFeature force)
	{
		super();
		this.force = force;
	}

	@Override
	public FeatureReader makeReader(FeatureReaderFactory.ReaderType st)
	{
		switch (st)
		{
		case Console:
			return new ForceConsoleReader(force);
		default:
			return null;
		}
	}

	@Override
	public FeatureWriter makeWriter(FeatureWriterFactory.WriterType st, OutputStream os)
	{
		switch (st)
		{
		case Console:
			return new ForceConsoleWriter(force);
		default:
			return null;
		}
	}

}
