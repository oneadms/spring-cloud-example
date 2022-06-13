package com.smart.consumer.feign;

import com.smart.consumer.UserParams;
import feign.Param;
import feign.QueryMap;
import java.util.HashMap;
import java.util.Map;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "feign-provider", path = "/api/provider")
public interface TestFeign {

  @RequestMapping("/hello")
   String hello();

  @RequestMapping("/obj1")
   UserParams object1(@SpringQueryMap UserParams userParams);

  @RequestMapping("/obj2")
  UserParams object2(@RequestBody UserParams userParams);
  @PostMapping("/map2")
   Map<String ,Object> mapObj2(@RequestBody Map<String ,Object>  map) ;
  @PostMapping("/map1")

  Map<String ,Object> mapObj1( @SpringQueryMap Map<String ,Object> map) ;
}
