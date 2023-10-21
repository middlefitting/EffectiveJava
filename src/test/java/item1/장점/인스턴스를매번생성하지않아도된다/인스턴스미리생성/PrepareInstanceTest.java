package item1.장점.인스턴스를매번생성하지않아도된다.인스턴스미리생성;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * PrepareInstanceTest.
 *
 * @author : middlefitting
 * @since : 2023/10/21
 */
@DisplayName("클래스 멤버로 인스턴스 준비하기")
class PrepareInstanceTest {
  @Test
  @DisplayName("여러번 호출되어도 같은 인스턴스를 반환한다.")
  void sameInstanceTest() {
    //Arrange
    PrepareInstance instance = PrepareInstance.getInstance();
    PrepareInstance instance2 = PrepareInstance.getInstance();

    //Act
    Boolean result = instance == instance2;

    //Assert
    assertTrue(result);
  }
}