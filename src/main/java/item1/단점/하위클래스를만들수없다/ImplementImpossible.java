package item1.단점.하위클래스를만들수없다;

import lombok.NoArgsConstructor;

/**
 * ImplementImpossible.
 *
 * <p>
 *  이렇게 정적 팩터리만 열어놓으면 하위 클래스를 만들 수 없다.
 *  당연한 말이다. 하위 클래스를 만들 수 없으니, 확장할 수도 없다.
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/10/23
 */
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class ImplementImpossible {

    public static ImplementImpossible getNewInstance() {
      return new ImplementImpossible();
    }
}
