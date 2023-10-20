package item1.장점.이름을가질수있다;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * NamePossibleTest.
 *
 * @author : middlefitting
 * @since : 2023/10/20
 */
@DisplayName("장점1. 이름을 가질 수 있다.")
class NamePossibleTest {
  @Test
  @DisplayName("정적 팩토리는 이름을 가질 수 있다.")
  void NamePossible() {

    //Arrange
    NamePossible a = NamePossible.getNewInstanceA();
    NamePossible b = NamePossible.getNewInstanceB();

    //Act
    NameType aType = a.whoAmI();
    NameType bType = b.whoAmI();

    //Assert
    assertNotNull(a);
    assertNotNull(b);
    assertNotSame(a, b);
    assertSame(NameType.A, a.whoAmI());
    assertSame(NameType.B, b.whoAmI());
  }


}