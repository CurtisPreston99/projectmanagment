package com.example.heroku;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HerokuApplicationTests {

	@Test
	public void contextLoads() {
		int x=1;
		assert x==1;
	}

}

