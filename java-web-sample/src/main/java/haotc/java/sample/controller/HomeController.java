package haotc.java.sample.controller;

import haotc.java.sample.bo.ProductBo;
import haotc.java.sample.entity.ProductEntity;
import haotc.java.sample.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: haotc
 * Date: 9/9/13
 * Time: 1:20 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private ProductBo productBo;

    @RequestMapping(method = RequestMethod.GET)
    public String initProduct(Model model) {
        List<ProductEntity> products = productBo.getProductList();
        model.addAttribute("products", products);
        return "index";
    }
}
