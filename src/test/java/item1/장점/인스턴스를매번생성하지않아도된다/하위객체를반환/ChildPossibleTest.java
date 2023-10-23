package item1.장점.인스턴스를매번생성하지않아도된다.하위객체를반환;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * ChildPossibleTest.
 *
 * <p>
 *  하위객체 반환 테스트
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/10/21
 */
@DisplayName("하위객체를 반환할 수 있다")
class ChildPossibleTest {

  @Test
  @DisplayName("하위 객체를 반환하고 api를 작게 유지 가능")
  void test() {
    //Arrange
    ChildPossible childPossible = ChildPossible.getNewInstance();

    //Act
    MyNameType myNameType = childPossible.whoAmI();

    //Assert
    assertEquals(MyNameType.CHILD, myNameType);
  }
}