package in.ashokit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "in.ashokit")
@EnableTransactionManagement
public class AppConfig {

	@Bean
	public DataSource dataSource() {

		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverClassName("com.mysql.cj.jdbc.Driver"); // SI
		ds.setUrl("jdbc:mysql://localhost:3306/sbms75"); // SI
		ds.setUsername("root"); // SI
		ds.setPassword("root"); // SI

		return ds;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		
		LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
		
		factory.setDataSource(dataSource());
		
		factory.setPackagesToScan("in.ashokit.entity");
		
		Properties props = new Properties();
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		props.put("hibernate.hbm2ddl.auto", "update");
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.format_sql", "true");
		
		factory.setHibernateProperties(props);
		
		return factory;
	}

	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory().getObject());
		return txManager;
	}
	
	@Bean
    public HibernateTemplate hibernateTemplate(SessionFactory sessionFactory) {
        return new HibernateTemplate(sessionFactory);
    }
}
