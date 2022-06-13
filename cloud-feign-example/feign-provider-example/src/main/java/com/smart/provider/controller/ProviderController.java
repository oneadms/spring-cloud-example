package com.smart.provider.controller;

import com.smart.provider.qo.UserParams;
import java.util.Map;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderController {
  @RequestMapping("/hello")
  public String hello() {
    return "hello";
  }
  @RequestMapping("/obj1")
  public UserParams object1(  UserParams userParams) {

    return userParams;
  }

  @RequestMapping("/obj2")
  public UserParams object2(@RequestBody UserParams userParams) {

    return userParams;
  }
  @PostMapping("/map1")
  public Map<String ,Object> mapObj(Map<String ,Object>  map) {
    return map;
  }
  @PostMapping("/map2")
  public Map<String ,Object> mapObj2(@RequestBody Map<String ,Object>  map) {
    return map;
  }
}
