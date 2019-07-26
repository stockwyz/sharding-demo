/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sharding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;

//@ComponentScan("org.apache.shardingsphere.example.common.mybatis")
//@MapperScan(basePackages = "org.apache.shardingsphere.example.common.mybatis.repository")
@SpringBootApplication
public class SpringBootMybatisMain {
    
    public static void main(final String[] args) {
    	SpringApplication.run(SpringBootMybatisMain.class, args);
//        try (ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootMybatisMain.class, args)) {
//            CommonService commonService = applicationContext.getBean(SpringPojoService.class);
//            commonService.initEnvironment();
//            commonService.processSuccess();
//            commonService.cleanEnvironment();
//        }
    }
}
