// copyright@gooooloo

package com.qidu.lin.CAE.Pre.Bridge.framework.factory;

import com.qidu.lin.CAE.Pre.Bridge.framework.Feature;
import com.qidu.lin.CAE.Pre.Bridge.framework.concrete.ForceFeature;

public class FeatureFactory
{

	public enum FeatureType
	{
		Force,
	}
	
	public static Feature makeFeature(FeatureType type)
	{
		switch (type)
		{
		case Force:
			return new ForceFeature();
		default:
			return null;
		}
	}
}
