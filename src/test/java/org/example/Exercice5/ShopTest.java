package org.example.Exercice5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShopTest {

    Product product = new Product();
    Shop shop = new Shop();

    @Test
    public void testUpdateNormalProductBeforeSellInSellIn() {
        product.setType("normal");
        product.setSellIn(10);
        product.setQuality(20);

        shop.update(product);

        assertEquals(9, product.getSellIn());
    }

    @Test
    public void testUpdateNormalProductBeforeSellInQuality() {
        product.setType("normal");
        product.setSellIn(10);
        product.setQuality(20);

        shop.update(product);

        assertEquals(19, product.getQuality());
    }

    @Test
    public void testUpdateNormalProductAfterSellInSellIn() {
        product.setType("normal");
        product.setSellIn(0);
        product.setQuality(20);

        shop.update(product);

        assertEquals(-1, product.getSellIn());
    }

    @Test
    public void testUpdateNormalProductAfterSellInQuality() {
        product.setType("normal");
        product.setSellIn(0);
        product.setQuality(20);

        shop.update(product);

        assertEquals(18, product.getQuality());
    }

    @Test
    public void testUpdateQualityNeverNegativeSellIn() {
        product.setType("normal");
        product.setSellIn(10);
        product.setQuality(0);

        shop.update(product);

        assertEquals(9, product.getSellIn());
    }

    @Test
    public void testUpdateQualityNeverNegativeQuality() {
        product.setType("normal");
        product.setSellIn(10);
        product.setQuality(0);

        shop.update(product);

        assertEquals(0, product.getQuality());
    }

    @Test
    public void testUpdateBrieQualityIncreasesSellIn() {
        product.setType("brie");
        product.setSellIn(10);
        product.setQuality(10);

        shop.update(product);

        assertEquals(9, product.getSellIn());
    }

    @Test
    public void testUpdateBrieQualityIncreasesQuality() {
        product.setType("brie");
        product.setSellIn(10);
        product.setQuality(10);

        shop.update(product);

        assertEquals(11, product.getQuality());
    }

    @Test
    public void testUpdateDairyProductDegradesFasterSellIn() {
        product.setType("dairy");
        product.setSellIn(10);
        product.setQuality(20);

        shop.update(product);

        assertEquals(9, product.getSellIn());
    }

    @Test
    public void testUpdateDairyProductDegradesFasterQuality() {
        product.setType("dairy");
        product.setSellIn(10);
        product.setQuality(20);

        shop.update(product);

        assertEquals(18, product.getQuality());
    }
}