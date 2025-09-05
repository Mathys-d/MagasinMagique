package com.magasin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

    @Test
    void foo() {
        Item[] items = new Item[] {
                new Item("Kryptonite", 20, 20),
                new Item("Pass VIP Concert", 20, 10),
                new Item("Comté", 0, 15),
                new Item("Pass VIP Concert", -1, 1),
                new Item("Comté", 0, 15),
                new Item("Kryptonite", 0, 20),
                new Item("random", 0, 20),
                new Item("Kryptonite", 20, 20),
                new Item("Pass VIP Concert", 10, 10),
                new Item("Comté", 20, 50),
                new Item("Pass VIP Concert", -1, 1),
                new Item("Pouvoirs magiques", 10, 1)

        };

        Magasin app = new Magasin(items);
        app.updateQuality();

        assertEquals("Kryptonite", app.items[0].name);
        assertEquals("Pass VIP Concert", app.items[1].name);
        assertEquals("Comté", app.items[2].name);
        assertEquals("Pass VIP Concert", app.items[3].name);
        assertEquals("Comté", app.items[4].name);
        assertEquals("Kryptonite", app.items[5].name);
        assertEquals("random", app.items[6].name);
        assertEquals("Kryptonite", app.items[7].name);
        assertEquals("Pass VIP Concert", app.items[8].name);
        assertEquals("Comté", app.items[9].name);
        assertEquals("Pass VIP Concert", app.items[10].name);
        assertEquals(0, app.items[11].quality);

    }






    @Test
    void foo1() {

        Item[] items = new Item[] {
                new Item("Kryptonite", 20, 20),
                    new Item("Pass VIP Concert", 20, 10),
                new Item("Comté", 0, 15),
                    new Item("Pass VIP Concert", -1, 1),
                new Item("Comté", 0, 15),
                    new Item("Kryptonite", 0, 20),
                new Item("random", 0, 20),
                    new Item("Kryptonite", 20, 20),
                new Item("Pass VIP Concert", 10, 10),
                    new Item("Comté", 20, 50),
                new Item("Pass VIP Concert", -1, 1),
                    new Item("Pouvoirs magiques", 10, 2)
        };

        Magasin2 app = new Magasin2(items);
        app.updateQuality2();

      assertEquals(80 , app.items[0].quality);
          assertEquals("Pass VIP Concert", app.items[1].name);
      assertEquals("Comté", app.items[2].name);
          assertEquals( 0 , app.items[3].quality);
      assertEquals(15, app.items[4].quality);
          assertEquals("Kryptonite", app.items[5].name);
      assertEquals("random", app.items[6].name);
          assertEquals("Kryptonite", app.items[7].name);
      assertEquals("Pass VIP Concert", app.items[8].name);
          assertEquals("Comté", app.items[9].name);
      assertEquals("Pass VIP Concert", app.items[10].name);
           assertEquals(0, app.items[11].quality);
    }
}
