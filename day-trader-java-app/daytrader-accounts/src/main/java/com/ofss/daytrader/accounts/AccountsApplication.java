/**
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.ofss.daytrader.accounts;

import javax.sql.DataSource;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.apache.tomcat.util.descriptor.web.ContextResource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
<<<<<<< HEAD
=======
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
/*import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;*/
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan(basePackages={"com.ofss.daytrader"})
@SpringBootApplication
@EntityScan(basePackages={"com.ofss.daytrader.entities"})
@EnableJpaRepositories(basePackages={"com.ofss.daytrader.accounts.repository"})
public class AccountsApplication /*extends SpringBootServletInitializer*/ {
//  Configure database environment 
//    private static String driverClassName = System.getenv("DAYTRADER_DATABASE_DRIVER");
//    private static String url = System.getenv("DAYTRADER_DATABASE_URL");
//    private static String username = System.getenv("DAYTRADER_DATABASE_USERNAME");
//    private static String password = System.getenv("DAYTRADER_DATABASE_PASSWORD");

	public static void main(String[] args) throws Exception 
	{	
		SpringApplication.run(AccountsApplication.class, args);
	}

	@Bean
	public TomcatServletWebServerFactory tomcatFactory() 
	{
		TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory() 
		{
			@Override
			protected TomcatWebServer getTomcatWebServer(Tomcat tomcat) {
				tomcat.enableNaming();
				return super.getTomcatWebServer(tomcat);
			}

			@Override
			protected void postProcessContext(Context context) 
			{
				//
				// Accounts Data Source
				//
				System.out.println("driverClassName============"+driverClassName);
				ContextResource accountsDataSource = new ContextResource();
				accountsDataSource.setName("jdbc/AccountsDataSource");
				accountsDataSource.setAuth("Container");
				accountsDataSource.setType(DataSource.class.getName());
				// Set Database Properties
				accountsDataSource.setProperty("driverClassName", driverClassName);
				accountsDataSource.setProperty("url", url);
                if(username != null && !username.trim().equals("")) {
                    accountsDataSource.setProperty("username", username);
                    accountsDataSource.setProperty("password", password);
                }
				accountsDataSource.setProperty("maxActive", "100");
				accountsDataSource.setProperty("maxIdle", "30");
				accountsDataSource.setProperty("maxWait", "10000");
				context.getNamingResources().addResource(accountsDataSource);
			}
		};
		
	    return factory;
	}
	
}

