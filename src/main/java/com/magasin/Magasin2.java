package com.magasin;

import java.util.Objects;

class Magasin2 {
    Item[] items;

    public Magasin2(Item[] items) {
        this.items = items;
    }

    public void updateQuality2() {
        for (int i = 0; i < items.length; i++) {

            if (items[i].quality >= 50 &&  !Objects.equals(items[i].name, "Kryptonite")) {
                items[i].quality = 50;
            }
            if  (items[i].sellIn <= 0 && !Objects.equals(items[i].name, "Kryptonite")) {
                items[i].quality = items[i].quality- 1;
            } items[i].quality = items[i].quality- 1 ;
            items[i].sellIn = items[i].sellIn - 1 ;


            if (Objects.equals(items[i].name, "Kryptonite")){
                items[i].quality = 80;
                items[i].sellIn = items[i].sellIn + 1;
            }

            if (Objects.equals(items[i].name, "Pass VIP Concert")) {
                if (items[i].sellIn < 11) {
                    items[i].quality = items[i].quality + 2;
                    if (items[i].sellIn < 6) {
                        items[i].quality = items[i].quality + 1;
                        if (items[i].sellIn <= 0) {
                            items[i].quality = 0;
                        }
                    }
                }
            }

            if (Objects.equals(items[i].name, "Comté")) {
                items[i].quality = items[i].quality + 2;
            }
            if (items[i].quality <= 0) {
                items[i].quality = 0;
            }
        }
    }
}