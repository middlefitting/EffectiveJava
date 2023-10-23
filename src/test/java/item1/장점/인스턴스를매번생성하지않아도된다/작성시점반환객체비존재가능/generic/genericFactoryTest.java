package item1.장점.인스턴스를매번생성하지않아도된다.작성시점반환객체비존재가능.generic;

import static org.junit.jupiter.api.Assertions.*;

import item1.장점.작성시점반환객체비존재가능.Animal;
import item1.장점.작성시점반환객체비존재가능.AnimalImpl;
import item1.장점.작성시점반환객체비존재가능.generic.genericFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * genericFactoryTest.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/10/23
 */
@DisplayName("정적 팩토리 작성 시점에는 반환 객체 클래스가 존재하지 않아도 된다..")
class genericFactoryTest {
  @Test
  @DisplayName("Animal 인터페이스를 구현한 객체를 반환한다")
  void factorySuccess() {
    //Arrange
    genericFactory<AnimalImpl> animalGenericFactory = new genericFactory<>();
    //Act
    Animal animal = animalGenericFactory.createInstance(AnimalImpl.class);
    //Assert
    assertTrue(animal.isAnimal());
  }

  @Test
  @DisplayName("Animal 인터페이스는 반환할 수 없다")
  void factoryFailed() {
    //Arrange
    genericFactory<Animal> animalGenericFactory = new genericFactory<>();
    //Act
    //Assert
    assertThrows(RuntimeException.class, () -> animalGenericFactory.createInstance(Animal.class));
  }
}