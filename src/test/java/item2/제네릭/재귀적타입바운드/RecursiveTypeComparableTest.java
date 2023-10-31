package item2.제네릭.재귀적타입바운드;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * RecursiveTypeComparableTest.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/10/31
 */
@DisplayName("재귀적 타입 바운드")
class RecursiveTypeComparableTest {

  @Test
  @DisplayName("Comparable 테스트")
  void test() {
    //Arrange
    RecursiveTypeComparable<Integer> recursiveTypeComparable = new RecursiveTypeComparable<>(1);
    RecursiveTypeComparable<Integer> recursiveTypeComparable2 = new RecursiveTypeComparable<>(2);

    //Act
    int result = recursiveTypeComparable.compareTo(recursiveTypeComparable2);

    //Assert
    assertEquals(-1, result);
  }
}