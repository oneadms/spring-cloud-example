package com.smart.consumer.controller;

import com.smart.consumer.UserParams;
import com.smart.consumer.feign.TestFeign;
import feign.Param;
import feign.QueryMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.checkerframework.checker.signature.qual.DotSeparatedIdentifiersOrPrimitiveType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

  @Autowired
  private TestFeign testFeign;

  @RequestMapping("/hello")
  public String hello() {
    return testFeign.hello();
  }
  @RequestMapping("/obj1")
  public UserParams object1(@SpringQueryMap UserParams userParams) {

    return testFeign.object1(userParams);
  }

  @RequestMapping("/obj2")
  public UserParams object2(@RequestBody UserParams userParams) {

    return testFeign.object2(userParams);
  }
  //TODO 有问题  无法接收参数 @RequestParam 可以正常接收 但是feign接收不到
  @PostMapping("/map1")
  public Map<String ,Object> mapObj(@SpringQueryMap LinkedHashMap<String ,Object> map) {
    return testFeign.mapObj1(map);
  }
  @PostMapping("/map2")
  public Map<String ,Object> mapObj2(@RequestBody Map<String ,Object>  map) {
    return testFeign.mapObj2(map);
  }

}
