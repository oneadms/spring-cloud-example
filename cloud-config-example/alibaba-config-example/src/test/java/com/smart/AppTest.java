package com.smart;

import com.smart.config.TestConfig;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AppTest {

  @Autowired
  private TestConfig testConfig;

  @Test
  public void test01() {
    System.out.println("testConfig.getVersion() = " + testConfig.getVersion());
  }
}
