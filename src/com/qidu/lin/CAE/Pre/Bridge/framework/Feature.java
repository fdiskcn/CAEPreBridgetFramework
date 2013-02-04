// copyright@gooooloo

package com.qidu.lin.CAE.Pre.Bridge.framework;

import java.io.InputStream;
import java.io.OutputStream;

import com.qidu.lin.CAE.Pre.Bridge.framework.factory.FeatureReaderFactory;
import com.qidu.lin.CAE.Pre.Bridge.framework.factory.FeatureWriterFactory;

public abstract class Feature
{
	FeatureReaderFactory frf;
	FeatureWriterFactory fwf;

	protected Feature()
	{
		frf = makeReaderFactory();
		fwf = makeWriterFactory();
	}

	abstract protected FeatureReaderFactory makeReaderFactory();

	abstract protected FeatureWriterFactory makeWriterFactory();

	void readFrom(InputStream is, FeatureReaderFactory.ReaderType st)
	{
		FeatureReader fr = frf.makeReader(st);
		fr.read();
	}

	void writeTo(OutputStream is, FeatureWriterFactory.WriterType st)
	{
		FeatureWriter fw = fwf.makeWriter(st, is);
		fw.write();
	}
}
