package org.gradle.testng_third;

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

  @Test
  public void test2(){
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line2");
    System.err.println("line3");
    System.err.println("line4");
    System.err.println("line5");
    System.err.println("line6");
    System.err.println("line7");
    System.err.println("line8");
  }
  
  @Test
  public void test3(){
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line2");
    System.err.println("line3");
    System.err.println("line4");
    System.err.println("line5");
    System.err.println("line6");
    System.err.println("line7");
    System.err.println("line8");
  }
  
  @Test
  public void test4(){
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line2");
    System.err.println("line3");
    System.err.println("line4");
    System.err.println("line5");
    System.err.println("line6");
    System.err.println("line7");
    System.err.println("line8");
  }
  
  @Test
  public void test5(){
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line2");
    System.err.println("line3");
    System.err.println("line4");
    System.err.println("line5");
    System.err.println("line6");
    System.err.println("line7");
    System.err.println("line8");
  }
  
  @Test
  public void test6(){
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line2");
    System.err.println("line3");
    System.err.println("line4");
    System.err.println("line5");
    System.err.println("line6");
    System.err.println("line7");
    System.err.println("line8");
  }
  
  @Test
  public void test7(){
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line2");
    System.err.println("line3");
    System.err.println("line4");
    System.err.println("line5");
    System.err.println("line6");
    System.err.println("line7");
    System.err.println("line8");
  }
  
  @Test
  public void test8(){
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line2");
    System.err.println("line3");
    System.err.println("line4");
    System.err.println("line5");
    System.err.println("line6");
    System.err.println("line7");
    System.err.println("line8");
  }
  
  @Test
  public void test9(){
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line1");
    System.err.println("line2");
    System.err.println("line3");
    System.err.println("line4");
    System.err.println("line5");
    System.err.println("line6");
    System.err.println("line7");
    System.err.println("line8");
  }
}
