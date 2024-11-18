package ma.emsi.billingservice.services;

import ma.emsi.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "INVENTORY-SERVICE")
public interface ProductRestClient {
    @GetMapping(path = "/api/products/{id}")
    Product findProductById(@PathVariable Long id);
    @GetMapping(path = "/api/products")
    PagedModel<Product> allProducts();
}
