// copyright@gooooloo

package com.qidu.lin.CAE.Pre.Bridge.framework.factory;

import java.io.OutputStream;

import com.qidu.lin.CAE.Pre.Bridge.framework.FeatureWriter;

public interface FeatureWriterFactory
{
	public enum WriterType
	{
		ADVC, ADVCV4, Ansys, Console, GUI,
	}
	FeatureWriter makeWriter(WriterType st, OutputStream os);
}
