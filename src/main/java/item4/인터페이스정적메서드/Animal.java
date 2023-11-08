package item4.인터페이스정적메서드;

/**
 * Animal.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/11/09
 */
public interface Animal {
  static Animal create(String name) {
    return new AnimalImpl(name);
  }
}

class AnimalImpl implements Animal {
  private String name;

  public AnimalImpl(String name) {
    this.name = name;
  }
}