/*
 * Copyright 2018 datagear.tech. All Rights Reserved.
 */

package org.datagear.model.features;

import org.datagear.model.PropertyFeature;
import org.datagear.model.ValueFeature;

/**
 * 最大长度。
 * 
 * @author datagear@163.com
 *
 */
public class MaxLength extends ValueFeature<Integer> implements PropertyFeature
{
	public MaxLength()
	{
		super();
	}

	public MaxLength(Integer value)
	{
		super(value);
	}
}
