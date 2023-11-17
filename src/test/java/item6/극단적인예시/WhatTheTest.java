package item6.극단적인예시;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

/**
 * WhatTheTest.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/11/17
 */
@State(Scope.Benchmark)
class WhatTheTest {

  @Test
  @DisplayName("String 재사용하지 않을 경우 테스트 소요시간")
  void test() {
    //Arrange
    long start = System.currentTimeMillis();
    String s;
    WhatThe whatThe = new WhatThe();
    ArrayList<String> strings = new ArrayList<>();
    //Act
    for (int i = 0; i < 10000000; i++) {
      s = whatThe.giveMeString();
      strings.add(s);
    }
    //Assert
    long end = System.currentTimeMillis();
    System.out.println("걸린 시간 : " + (end - start) + "ms");
  }

  @Test
  @DisplayName("String 재사용할 경우 테스트 소요시간")
  void test2() {
    //Arrange
    long start = System.currentTimeMillis();
    String s;
    WhatThe whatThe = new WhatThe();
    ArrayList<String> strings = new ArrayList<>();
    //Act
    for (int i = 0; i < 10000000; i++) {
      s = whatThe.giveMeString2();
      strings.add(s);
    }
    //Assert
    long end = System.currentTimeMillis();
    System.out.println("걸린 시간 : " + (end - start) + "ms");
  }
}