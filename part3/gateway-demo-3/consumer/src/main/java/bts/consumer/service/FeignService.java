package bts.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author nqh
 * @date 2025/8/14 16:43
 * @description
 */
@FeignClient(value = "provider")
public interface FeignService {
   @RequestMapping(method = RequestMethod.GET, value = "/find/{productid}")
    String findProductById(@PathVariable("productid") String productid);
}
