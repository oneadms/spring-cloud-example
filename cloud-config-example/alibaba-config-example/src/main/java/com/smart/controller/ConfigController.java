package com.smart.controller;

import com.smart.config.TestConfig;
import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

  @Autowired
  private TestConfig testConfig;

  @RequestMapping("/config")
  public String config() {
    return testConfig.getVersion();
  }
}
