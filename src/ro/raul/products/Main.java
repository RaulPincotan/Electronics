package ro.raul.products;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Product perfume = new Cosmetic(99.89, "Hugo boss", "cosmetics", "blue", 100);
        Product afterShave = new Cosmetic(99.89, "Lacoste", "cosmetics", "blue", 200);
        Electronics tv = new Electronics(499.95, "SONY", "electronics", "TV", 124.4, 100.90, 87.7, 12.1);
        Fridge fridge = new Fridge(430.35, "Arctic", "fridge", "FRIDGE", 124.4, 100.90, 87.7, 12.1, -15.8);
        Cosmetic perfume1 = new Cosmetic(39.89, "CK", "cosmetics", "grey", 75);

        List<Product> products = new ArrayList<>();

        products.add(perfume);
        products.add(afterShave);
        products.add(tv);
        products.add(fridge);
        products.add(perfume1);

        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("------------------");

        Map<String, List<Product>> mapProduct = putIntoMap(products);

        for (String product : mapProduct.keySet()) {
            System.out.println(product + "->" + mapProduct.get(product));
        }

    }


    public static Map<String, List<Product>> putIntoMap(List<Product> products) {
        Map<String, List<Product>> mapResult = new HashMap<>();

        for (Product product : products) {
            List<Product> productList = mapResult.get(product.getDescription());

            if (productList == null) {
                productList = new ArrayList<>();
            }
            productList.add(product);
            mapResult.put(product.getDescription(), productList);

        }
        return mapResult;
    }

}


