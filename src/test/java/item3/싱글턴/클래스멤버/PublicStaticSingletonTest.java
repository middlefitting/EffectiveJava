package item3.싱글턴.클래스멤버;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * PublicStaticSingletonTest.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/11/01
 */
@DisplayName("public static final 필드 방식의 싱글턴 테스트")
class PublicStaticSingletonTest {
  @Test
  @DisplayName("여러번 접근해도 당연히 같은 객체")
  void test() {
    //Arrange
    PublicStaticSingleton publicStaticSingleton1 = PublicStaticSingleton.INSTANCE;
    PublicStaticSingleton publicStaticSingleton2 = PublicStaticSingleton.INSTANCE;
    //Act
    //Assert
    assertEquals(publicStaticSingleton1, publicStaticSingleton2);
    assertEquals(publicStaticSingleton1.getAge(), publicStaticSingleton2.getAge());
    assertEquals(publicStaticSingleton1.getName(), publicStaticSingleton2.getName());
    assertEquals(publicStaticSingleton1.getEmail(), publicStaticSingleton2.getEmail());

  }
}