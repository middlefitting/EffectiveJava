package item1.장점.작성시점반환객체비존재가능.generic;

import item1.장점.작성시점반환객체비존재가능.Animal;
import java.lang.reflect.InvocationTargetException;

/**
 * genericFactory.
 *
 * <p>
 *  제네릭을 사용할 경우 객체의 범위를 리플렉션에 비해 좁힐 수 있다.
 *  <br>
 *  작성시점에 반환 객체가 존재하지 않아도 되며 런타임에 확인된다.
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/10/21
 */
public class genericFactory<T extends Animal> {


  /**
   * <p>
   *  getDeclaredConstructor() : 리플렉션 API를 사용하여 생성자를 가져온다.
   *  <br>
   *  newInstance() : 생성자를 통해 객체를 생성한다.
   *  <br>
   *  NoSuchMethodException : 생성자가 없을 경우 발생한다.
   *  <br>
   *  InvocationTargetException : 메서드 내부에서 발생하는 예외를 JVM이 InvocationTargetException으로 감싸서 던진다.
   *  <br>
   *  InstantiationException : 추상 클래스나 인터페이스일 경우 발생한다.
   *  <br>
   *  IllegalAccessException : 생성자에 접근할 수 없을 경우 발생한다.
   * </p>
   *
   * @param clazz  생성할 객체의 클래스
   * @return T extends Animal
   * @throws RuntimeException
   */

  public T createInstance(Class<T> clazz) {
    try {
      return clazz.getDeclaredConstructor().newInstance();
    } catch (NoSuchMethodException | InvocationTargetException |
             InstantiationException | IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }
}
