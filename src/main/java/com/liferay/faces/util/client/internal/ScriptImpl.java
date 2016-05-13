/**
 * Copyright (c) 2000-2016 Liferay, Inc. All rights reserved.
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
package com.liferay.faces.util.client.internal;

import com.liferay.faces.util.client.Script;
import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;


/**
 * @author  Kyle Stiemann
 */
public class ScriptImpl implements Script {

	// Logger
	private static final Logger logger = LoggerFactory.getLogger(ScriptImpl.class);

	// Private Data Members
	private String sourceCode;
	private String[] modules;
	private Type type;

	public ScriptImpl(String sourceCode) {
		this(sourceCode, null, null);
	}

	public ScriptImpl(String sourceCode, String[] modules, Type type) {
		this.sourceCode = sourceCode;

		if ((modules != null) && (type == null)) {
			logger.warn("Modules will be ignored on scripts with type == null.");
		}

		this.modules = modules;
		this.type = type;
	}

	@Override
	public String[] getModules() {
		return modules;
	}

	@Override
	public String getSourceCode() {
		return sourceCode;
	}

	@Override
	public Type getType() {
		return type;
	}
}