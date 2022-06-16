package com.smart.sentinel.fallback;

import com.smart.sentinel.controller.ProviderApi;
import org.springframework.stereotype.Component;

@Component
public class ProviderFallBack implements ProviderApi {

  @Override
  public String test() {

    return "服务不可用,请等待";
  }
}
