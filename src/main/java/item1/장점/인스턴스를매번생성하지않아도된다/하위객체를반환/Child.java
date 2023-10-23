package item1.장점.인스턴스를매번생성하지않아도된다.하위객체를반환;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Child.
 *
 * ChildPossible을 상속받아 구현한 클래스2.
 *
 * @author : middlefitting
 * @since : 2023/10/20
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Child extends ChildPossible {

  @Override
  public MyNameType whoAmI() {
    return MyNameType.CHILD;
  }
}
