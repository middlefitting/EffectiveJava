package item4.추상클래스만으로는인스턴스화를막을수없다;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * InstancePossibleTest.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/11/09
 */
@DisplayName("추상클래스만으로는인스턴스화를막을수없다")
class InstancePossibleTest {

  @Test
  @DisplayName("자식은 인스턴스화 가능")
  void test() {
    //Arrange
    InstancePossible instancePossible = new InstancePossibleImpl();
    //Act
    //Assert
    instancePossible.print();
    instancePossible.print2();
  }
}