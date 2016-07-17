package com.springcamelmybatis.db.config;

import org.apache.camel.component.mybatis.MyBatisComponent;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@MapperScan("com.springcamelmybatis.db.mapper")
public class MybatisConfig {
	
	@Bean(name="mybatis")
	public MyBatisComponent myBatisComponent( SqlSessionFactory sqlSessionFactory )
	{
	    MyBatisComponent result = new MyBatisComponent();
	    result.setSqlSessionFactory( sqlSessionFactory );
	    return result;
	}
	
//	@Autowired
//	DataSource dataSource;
//
//    @Bean
//    public SqlSessionFactoryBean sqlSessionFactory() {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(
//                "SqlMapConfig.xml"));
//        return sqlSessionFactoryBean;
//    }
//    
//	public DataSource getDataSource() {
//		return dataSource;
//	}
//
//	public void setDataSource(DataSource dataSource) {
//		this.dataSource = dataSource;
//	}
}
