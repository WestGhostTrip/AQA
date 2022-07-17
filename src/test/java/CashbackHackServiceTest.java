import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    CashbackHackService cash = new CashbackHackService();

@Test
    public void remain1(){

    int actual = cash.remain(700);
    int exepted = 300;

    Assert.assertEquals(actual,exepted);
}

    @Test
    public void remain2(){

        int actual = cash.remain(1200);
        int exepted = 800;

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
