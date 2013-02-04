// copyright@gooooloo

/*
 * this project is mainly to build a framework which is suitable for CAE Pre system.
 * CAE Pre system usually face a problem that it has many way to import some data set from different sources,
 * such as GUI, console, script, other CAE result file, and need to export data set to different format files.
 * So the biggest problem in real development is that: User need new support to importing new data set with new source type,
 * or to add new GUI for new data definition. 
 * So Bridge pattern can be used in this sense, to separate this most risky, most frequently changed part, so that maintaining,
 * or develop new features are much easier.
 * 
 */

package com.qidu.lin.CAE.Pre.Bridge.framework;

import com.qidu.lin.CAE.Pre.Bridge.framework.factory.FeatureFactory;
import com.qidu.lin.CAE.Pre.Bridge.framework.factory.FeatureReaderFactory;
import com.qidu.lin.CAE.Pre.Bridge.framework.factory.FeatureWriterFactory;

public class MAIN
{
	public static void main(String[] s)
	{
		Feature force = FeatureFactory.makeFeature(FeatureFactory.FeatureType.Force);

		force.readFrom(System.in, FeatureReaderFactory.ReaderType.Console);
		force.writeTo(System.out, FeatureWriterFactory.WriterType.Console);

		System.out.print("done");
	}
}
