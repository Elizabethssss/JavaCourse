package project1.model;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import project1.model.ammunition.Ammunition;
import project1.model.ammunition.Boots;
import project1.model.ammunition.Material;
import project1.model.ammunition.TypeOfAmmo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class KnightTest {
    private Knight knight;
    private ArrayList<Ammunition> temp;
    @Parameterized.Parameter
    public int[] given;
    @Parameterized.Parameter(1)
    public ArrayList<Ammunition> expected;

    @Before
    public void initTests() {
        knight = new Knight(new AmmoStorage().getKit1());
    }

    @Parameterized.Parameters
    public static Collection data() {
        ArrayList<Ammunition> amm = new ArrayList<>();
        amm.add(new Boots("Iron boots", 1300, Material.IRON, TypeOfAmmo.BOOTS, 98, 4));
        return Arrays.asList(new Object[][] {
                {new int[]{1, 2}, new ArrayList<>()},
                {new int[]{3000, 4000}, new ArrayList<>()},
                {new int[]{1300, 1500}, amm}
        });
    }

    @Test(expected = NullPointerException.class)
   public void filterByPriceNull() {
       knight.filterByPrice(null);
        assertNull(knight.getFilteredKit());
   }

    @Test
    public void filterByPrice() {
        knight.filterByPrice(given);
        assertEquals(knight.getFilteredKit().toString(), expected.toString());
    }

    @Test
    public void sumAllZero() {
        knight = new Knight();
        assertEquals(knight.sumAll(), 0, 0);
    }

    @Test
    public void sumAll() {
        assertEquals( 11697, knight.sumAll(), 0);
    }

    @Test
    public void sortByWeight() {
        temp = knight.getKit();
        knight.sortByWeight();
        assertEquals(temp, knight.getKit());
    }

    @Test
    public void sortByPrice() {
        temp = knight.getKit();
        knight.sortByPrice();
        assertEquals(temp, knight.getKit());
    }

}