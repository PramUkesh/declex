/**
 * Copyright (C) 2016-2017 DSpot Sp. z o.o
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dspot.declex.plugin;

import javax.lang.model.element.Element;

import org.androidannotations.holder.GeneratedClassHolder;

public abstract class HolderClassCreator extends BaseClassCreator {
	protected GeneratedClassHolder holder;
	protected Element element;
	
	public HolderClassCreator(Element element, GeneratedClassHolder holder) {
		super(holder.getEnvironment());
		this.element = element;
		this.holder = holder;
	}	
}
