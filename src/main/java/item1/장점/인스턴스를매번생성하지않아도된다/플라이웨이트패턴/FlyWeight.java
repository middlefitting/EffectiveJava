package item1.장점.인스턴스를매번생성하지않아도된다.플라이웨이트패턴;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * FlyWeight.
 *
 * <p>
 *  고유한 상태는 내부에 보관하고, 공유하는 상태는 외부에서 받아오는 방식.
 *  <br/>
 *  플라이웨이트 패턴은 상태를 불변으로 고정해서 사용하는 경우가 많다.
 *  객체를 미리 많이 보유하고 빠르게 같은 객체를 반환해주는 것이다.
 *  <br/>
 * </p>
 * <p>
 *  팩토리가 강한 의존관계가 있으면 내부에 두어도 되지만, 여기서는 외부에 두기 위해 생성자 레벨을 DEFAULT로 지정한다.
 * </p>
 * <p>
 *  디자인 패턴에 관한 자세한 내용은 <a href="https://refactoring.guru/ko/design-patterns/flyweight">여기</a>를 참고하자.
 * </p>
 *
 * @author : middlefitting
 * @see FlyweightFactory
 * @since : 2023/10/21
 */
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
public class FlyWeight {

  /**
   * 고유한 상태
   */
  private final static  String name = "FlyWeight";

  /**
   * 공유하는 상태
   */
  private final short health;
}
