package item2.제네릭.재귀적타입바운드;

/**
 * Fruit.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/10/27
 */
public class Fruit<T extends Fruit<T>> {

  public static void main(String[] args) {
    Apple apple = new Apple();
    Orange orange = new Orange();
    OrangeApple orangeApple = new OrangeApple();
    orangeApple.hello();
  }
}

class Apple extends Fruit<Apple> { }

class Orange extends Fruit<Orange> { }

class OrangeApple extends Fruit<Orange> {
  public void hello() {
    System.out.println("hello");
  }
}
