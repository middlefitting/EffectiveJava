package item3.싱글턴.정적팩터리.리플렉션방지;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * ReflectionGuardTest.
 *
 * <p>
 *  리플렉션 공격 방지 테스트, 생성자에 방어로직을 작성하여 싱글턴 인스턴스를 보장한다
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/11/02
 */
class ReflectionGuardTest {

  @Test
  @DisplayName("리플렉션 공격 방지 테스트")
  void test() {
    //Arrange
    ReflectionGuard reflectionGuard = ReflectionGuard.getInstance();
    //Act
    //Assert
    Assertions.assertThrows(InvocationTargetException.class, () -> {
      ReflectionGuard reflectionGuard2 = null;
      Constructor[] constructors = ReflectionGuard.class.getDeclaredConstructors();
      for (Constructor constructor : constructors) {
        constructor.setAccessible(true);
        reflectionGuard2 = (ReflectionGuard) constructor.newInstance();
      }
    });
  }
}