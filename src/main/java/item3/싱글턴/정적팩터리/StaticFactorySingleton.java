package item3.싱글턴.정적팩터리;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * StaticFactorySingleton.
 *
 * <p>
 *  Item1 에서 다룬 static factory
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/11/01
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StaticFactorySingleton {
  private static final StaticFactorySingleton INSTANCE = new StaticFactorySingleton();

  public static StaticFactorySingleton getInstance() {
    return INSTANCE;
  }
}
