import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.*;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(feline);
        String actualResult = cat.getSound();
        String expectedResult = "Мяу";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFoodMockTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> actualResult = cat.getFood();
        Mockito.verify(feline).eatMeat();
    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> actualResult = cat.getFood();
        List<String> exceptedResult = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(exceptedResult, actualResult);
    }

}
