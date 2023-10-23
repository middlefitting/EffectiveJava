package item1.장점.이름을가질수있다;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * ChildPossible.
 *
 * @author : middlefitting
 * @since : 2023/10/20
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class NamePossible {

  /**
   * A의 인스턴스를 반환한다
   * @return A
   */
  public static NamePossible getNewInstanceA() {
    return new A();
  }

  /**
   * B의 인스턴스를 반환한다
   * @return B
   */
  public static NamePossible getNewInstanceB() {
    return new B();
  }

  /**
   * 자식들이 구현할 메서드.
   * @return NameType
   */
  public abstract NameType whoAmI();
}
