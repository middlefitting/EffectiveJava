package item1.정적팩터리;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * StaticFactoryTest.
 *
 * @author : middlefitting
 * @since : 2023/10/20
 */
class StaticFactoryTest {
  @Test
  @DisplayName("정적 팩터리 메서드 테스트")
  void staticFactory() {

    StaticFactory staticFactory = StaticFactory.getNewInstance();
    assertNotNull(staticFactory);
    StaticFactory staticFactory2 = StaticFactory.getNewInstance();
    assertNotSame(staticFactory, staticFactory2);
  }
}