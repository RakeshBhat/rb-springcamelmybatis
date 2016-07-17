package com.springcamelmybatis.db.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelMybatisCRUDRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		from("mybatis:getClaimInfo?statementType=SelectOne")
		.log("${body}")
		.to("file:target/claiminfo.txt")
		.setTrace("true");
		
	}

}
