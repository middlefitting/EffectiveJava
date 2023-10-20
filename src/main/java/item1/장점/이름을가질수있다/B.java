package item1.장점.이름을가질수있다;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * B.
 *
 * NamePossible을 상속받아 구현한 클래스2.
 *
 * @author : middlefitting
 * @since : 2023/10/20
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class B extends NamePossible {

  @Override
  public NameType whoAmI() {
    return NameType.B;
  }
}
