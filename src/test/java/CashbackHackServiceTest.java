import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    CashbackHackService cash = new CashbackHackService();

@Test
    public void remain1(){

    int actual = cash.remain(800);
    int exepted = 200;

    Assert.assertEquals(actual,exepted);
}

    @Test
    public void remain2(){

        int actual = cash.remain(1100);
        int exepted = 900;

        Assert.assertEquals(actual,exepted);
    }

    @Test
    public void remain3(){

        int actual = cash.remain(0);
        int exepted = 1000;

        Assert.assertEquals(actual,exepted);
    }
    @Test
    public void remain4(){

        int actual = cash.remain(1000);
        int exepted = 0;

        Assert.assertEquals(actual,exepted);
    }
}
