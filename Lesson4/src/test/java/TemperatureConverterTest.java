import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TemperatureConverterTest {
    private TemperatureConverter converter;
    @Parameterized.Parameter
    public double tempC;
    @Parameterized.Parameter(1)
    public double tempK;
    @Parameterized.Parameter(2)
    public double tempF;

    @Before
    public void initTest() {
        converter = new TemperatureConverter();
    }

    @Parameterized.Parameters()
    public static Collection data() {
        return Arrays.asList(new Object[][] {
                {0, 273.15, 32},
                {-273.15, 0, -459.67},
                {-17.78, 255.37, 0},
                {10, 283.15, 20}
        });
    }

    @Test
    public void convertFtoC() {
        assertEquals(tempC, converter.convertFtoC(tempF), 0.5);
    }

    @Test
    public void convertCtoF() {
        assertEquals(tempF, converter.convertCtoF(tempC), 0.5);
    }

    @Test
    public void convertCtoK() {
        assertEquals(tempK, converter.convertCtoK(tempC), 0.5);
    }

    @Test
    public void convertKtoC() {
        assertEquals(tempC, converter.convertKtoC(tempK), 0.5);
    }

    @Test
    public void convertFtoK() {
        assertEquals(tempK, converter.convertFtoK(tempF), 0.5);
    }

    @Test
    public void convertKtoF() {
        assertEquals(tempF, converter.convertKtoF(tempK), 0.5);
    }
}