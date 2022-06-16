package com.smart.sentinel.controller;

import com.smart.sentinel.fallback.ProviderFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * value == 提供着的名字
 */
@FeignClient(value = "alibaba-sentinel-provider-example",fallback = ProviderFallBack.class)
public interface ProviderApi {

  @RequestMapping("/test")
  String test();
}
