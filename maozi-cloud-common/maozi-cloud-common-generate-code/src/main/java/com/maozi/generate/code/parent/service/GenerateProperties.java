
/*
 * Copyright 2012-2018 the original author or authors.
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
 * 
 */

package com.maozi.generate.code.parent.service;

import com.maozi.generate.code.tool.SQLType;

public class GenerateProperties {

	public static void generate(String mobule,String pash,Boolean db) throws Exception {

			StringBuilder properties = new StringBuilder();
			
			if(db) {
				properties.append("spring.cloud.nacos.config.shared-dataids=${application-nacos-config},boot-datasource.yml,boot-db.yml\r\n");
			}else {
				properties.append("spring.cloud.nacos.config.shared-dataids=${application-nacos-config}\r\n");
			}

			/* 创建文件 Begin */
			SQLType.fileCreate(pash, "bootstrap", properties,"properties");
			/* 创建文件 End */


	}
	
}
