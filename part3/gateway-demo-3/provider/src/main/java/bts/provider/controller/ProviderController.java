package bts.provider.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author nqh
 * @date 2025/8/14 00:20
 * @description
 */
@RestController
public class ProviderController {
    @GetMapping(value = "/find/{productid}")
    public String findProduct(@PathVariable String productid) {
        return productid +"-------Provider:productName";
    }
}
