// copyright@gooooloo

package com.qidu.lin.CAE.Pre.Bridge.framework.factory;

import com.qidu.lin.CAE.Pre.Bridge.framework.FeatureReader;

public interface FeatureReaderFactory
{
	public enum ReaderType
	{
		ADVC, ADVCV4, Ansys, Console, GUI,
	}
	
	FeatureReader makeReader(ReaderType st);
}
