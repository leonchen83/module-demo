/*
 * Copyright 2016-2017 Leon Chen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.nextop.main.demo;

import java.util.Iterator;
import java.util.ServiceLoader;

import cn.nextop.sub.module1.SubModule1;
import cn.nextop.sub.module2.ExampleInterface;
import cn.nextop.sub.module2.SubModule2;

/**
 * @author Baoyi Chen
 */
public class Main {
	
	public static void main(String[] args) {
		
		// open 反射例子
//		new SubModule1().method0();
//		new SubModule1().method1();
		
		//require transitive 例子
//		new SubModule2().method1();

		//provides use例子
		ServiceLoader<ExampleInterface> loader = ServiceLoader.load(ExampleInterface.class);
		Iterator<ExampleInterface> it = loader.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getName());
		}
		
	}
}
