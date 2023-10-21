package item1.장점.인스턴스를매번생성하지않아도된다.하위객체를반환;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * ChildPossible.
 *
 * @author : middlefitting
 * @since : 2023/10/20
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class ChildPossible {

  /**
   *자식을 반환한다
   * @return Child
   */
  public static ChildPossible getNewInstance() {
    return new Child();
  }

  public abstract MyNameType whoAmI();
}
