package item2.builder.추상빌더;

import java.util.EnumSet;
import java.util.Set;

/**
 * Pizza.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/10/25
 */
public abstract class Pizza {
  public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }
  final Set<Topping> toppings;

  abstract static class Builder<T extends  Builder<T>> {
    EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
    public T addTopping(Topping topping) {
      toppings.add(topping);
      return self();
    }

    abstract Pizza build();

    protected abstract T self();
  }

  Pizza(Builder<?> builder) {
    toppings = builder.toppings.clone();
  }
}
