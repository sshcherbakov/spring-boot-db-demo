package io.pivotal.demo;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DbTestApplication.class)
@WebAppConfiguration
public class DbTestApplicationTests {
	
	@Autowired
	DataSource dataSource;

	@Test
	public void contextLoads() {
		Assert.notNull(dataSource);
	}

}
