package com.magasin;

import java.util.Objects;

class Magasin2 {
    Item[] items;

    public Magasin2(Item[] items) {
        this.items = items;
    }

    public void updateQuality2() {
        for (Item item : items) {

            if (item.quality >= 50 &&  !Objects.equals(item.name, "Kryptonite")) {
                item.quality = 50;
            }
            if  (item.sellIn <= 0 && !Objects.equals(item.name, "Kryptonite")) {
                item.quality = item.quality- 1;
            } item.quality = item.quality- 1 ;
            item.sellIn = item.sellIn - 1 ;


            if (Objects.equals(item.name, "Pouvoirs magiques")) {
                item.quality = item.quality - 1 ;
            }
            if (Objects.equals(item.name, "Kryptonite")){
                item.quality = 80;
                item.sellIn = item.sellIn + 1;
            }

            if (Objects.equals(item.name, "Pass VIP Concert")) {
                if (item.sellIn < 11) {
                    item.quality = item.quality + 2;
                    if (item.sellIn < 6) {
                        item.quality = item.quality + 1;
                        if (item.sellIn <= 0) {
                            item.quality = 0;
                        }
                    }
                }
            }

            if (Objects.equals(item.name, "Comté")) {
                item.quality = item.quality + 2;
            }
            if (item.quality <= 0) {
                item.quality = 0;
            }
        }
    }
}