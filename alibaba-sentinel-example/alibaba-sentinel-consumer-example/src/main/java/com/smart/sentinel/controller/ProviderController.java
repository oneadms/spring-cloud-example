package com.smart.sentinel.controller;

import javax.annotation.Resource;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
@Resource
  private ProviderApi providerApi;
  @RequestMapping("/hello")
  public String test(){
    return providerApi.test();
  }
}
