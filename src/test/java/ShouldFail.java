import org.testng.annotations.Test;

import static org.testng.Assert.fail;

/**
 * Created by Nikita.Skvortsov
 * date: 25.11.2015.
 */
public class ShouldFail {


  @Test(retryAnalyzer = MyRetry.class)
  public void test1() {
    fail("Non-conditional failure");
  }
}
