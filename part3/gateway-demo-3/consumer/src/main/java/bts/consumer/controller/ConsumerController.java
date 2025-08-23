package bts.consumer.controller;

import bts.consumer.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nqh
 * @date 2025/8/14 16:36
 * @description 
 */
@RestController
public class ConsumerController {
    @Autowired
    private FeignService feignService;

    @GetMapping (value = "/search/{productid}")

    public String search(@PathVariable String productid)
    {
//        return productid +":controllerproductName";
        return feignService.findProductById(productid);
    }
}
