package item4.private생성자;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * privateConstructorTest.
 *
 * <p>
 *  리플렉션으로 생성자를 호출하여도 방지됨
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/11/09
 */
@DisplayName("private 생성자를 통해 인스턴스화를 방지하자.")
class privateConstructorTest {

  @Test
  @DisplayName("인스턴스화 방지 테스트")
  void test() {
    //Arrange
    //Act
    //Assert
    assertThrows(InvocationTargetException.class, () -> {
      PrivateConstructor privateConstructor = null;
      Constructor[] constructors = PrivateConstructor.class.getDeclaredConstructors();
      for (Constructor constructor : constructors) {
        constructor.setAccessible(true);
        privateConstructor = (PrivateConstructor) constructor.newInstance();
      }
    });
  }
}