package item2.builder.빌더란;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * HelloBuilderTest.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/10/25
 */
@DisplayName("빌더 인스턴스 생성 테스트")
class HelloBuilderTest {

  @Test
  @DisplayName("인스턴스 만들기")
  void test() {
    //Arrange
    //Act
    HelloBuilder helloBuilder = new HelloBuilder.Builder("middlefitting")
        .age(28)
        .address("Seoul")
        .build();
    //Assert
    assertEquals("middlefitting", helloBuilder.getName());
    assertEquals(28, helloBuilder.getAge());
    assertEquals("Seoul", helloBuilder.getAddress());
  }

  @Test
  @DisplayName("필수 인자만으로 인스턴스 만들기")
  void buildSuccess2() {
    //Arrange
    //Act
    HelloBuilder helloBuilder = new HelloBuilder.Builder("middlefitting").build();
    //Assert
    assertEquals("middlefitting", helloBuilder.getName());
    assertEquals(20, helloBuilder.getAge());
    assertEquals("Seoul", helloBuilder.getAddress());
  }
}