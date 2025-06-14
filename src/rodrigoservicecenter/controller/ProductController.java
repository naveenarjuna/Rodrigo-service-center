package rodrigoservicecenter.controller;

import rodrigoservicecenter.model.ProductModel;
import rodrigoservicecenter.model.entity.Product;

import java.util.List;

public class ProductController {

    public List<Product> getAllProducts(){
        ProductModel productModel = new ProductModel();
        return productModel.getAllProducts();
    }

    public Product getProductById(Product product){
        ProductModel productModel = new ProductModel();
        return productModel.getProductById(product.getProductId());
    }

    public List<Product> getProductsByOutletId(int id){
        ProductModel productModel = new ProductModel();
        return productModel.getProductsByOutletId(id);
    }

    public List<Product> productSearch(String Keyword, int outletId){
        ProductModel productModel = new ProductModel();
        return productModel.searchProducts(Keyword, outletId);
    }

}
