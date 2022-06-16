package com.smart.sentinel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

  @RequestMapping("/test")
  public String test() {
    return "这是提供者";
  }
}
