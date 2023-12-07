import com.example.Feline.*;
import com.example.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;
import java.util.Objects;

@RunWith(Parameterized.class)
public class FelineTest {
    private final int kittensCount;
    private final int expected;
    Feline feline = new Feline();

    public FelineTest(int kittensCount, int expected){
        this.kittensCount = kittensCount;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCount() {
        return new Object[][] {
                {0,0},
                {2,2},
        };
    }
    @Test
    public void eatMeatTest() throws Exception {
        List<String> actualResult = feline.eatMeat();
        List<String> expectResult = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void getFamilyTest() {
        String actualResult = feline.getFamily();
        String expectedResult = "Кошачьи";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensNoParamsTest() {
        int actualResult = feline.getKittens();
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getKittensTest() {
        int actualResult = feline.getKittens(kittensCount);
        int expectedResult = expected;
        Assert.assertEquals(expectedResult, actualResult);
    }

}
