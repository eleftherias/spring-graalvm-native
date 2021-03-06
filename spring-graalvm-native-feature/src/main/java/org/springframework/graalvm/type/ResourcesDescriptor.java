/*
 * Copyright 2020 Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.graalvm.type;

import java.util.Arrays;

public class ResourcesDescriptor {
	
	private final String[] patterns;
	
	private final boolean isBundle;
	
	public ResourcesDescriptor(String[] patterns, boolean isBundle) {
		this.patterns = patterns;
		this.isBundle = isBundle;
	}
	
	public String[] getPatterns() {
		return patterns;
	}
	
	public boolean isBundle() {
		return isBundle;
	}
	
	public String toString() {
		return "RD[patterns="+Arrays.asList(patterns)+",isBundle="+isBundle+"]";
	}

}
