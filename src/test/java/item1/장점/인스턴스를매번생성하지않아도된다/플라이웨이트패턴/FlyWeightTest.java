package item1.장점.인스턴스를매번생성하지않아도된다.플라이웨이트패턴;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * FlyWeightTest.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/10/21
 */
@DisplayName("플라이웨이트 패턴")
class FlyWeightTest {
  @Test
  @DisplayName("공유변수가 다르면 다른 객체가 반환된다")
  void diffInstanceByDiffOuterVariable() {
    //Arrange
    FlyWeight a = FlyweightFactory.getFlyWeight((short) 100);
    FlyWeight b = FlyweightFactory.getFlyWeight((short) 200);

    //Act
    boolean result = a == b;

    //Assert
    assertFalse(result);
  }

  @Test
  @DisplayName("공유변수가 같으면 같은 객체 (캐시)가 반환된다")
  void sameInstanceByDifferenceOuterVariable() {
    //Arrange
    FlyWeight a = FlyweightFactory.getFlyWeight((short) 100);
    FlyWeight b = FlyweightFactory.getFlyWeight((short) 100);

    //Act
    boolean result = a == b;

    //Assert
    assertTrue(result);
  }
}