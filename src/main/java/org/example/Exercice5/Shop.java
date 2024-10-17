package org.example.Exercice5;

import java.util.List;

public class Shop {
    private List<Product> products;

    public void update(Product product) {
        int qualityChange = -1;

        if ("brie".equals(product.getType())) {
            qualityChange = 1;
        } else if ("dairy".equals(product.getType())) {
            qualityChange = -2;
        }

        product.setSellIn(product.getSellIn() - 1);

        if (product.getSellIn() < 0) {
            qualityChange *= 2;
        }

        int newQuality = product.getQuality() + qualityChange;
        if (newQuality < 0) {
            newQuality = 0;
        } else if (newQuality > 50) {
            newQuality = 50;
        }

        product.setQuality(newQuality);
    }
}