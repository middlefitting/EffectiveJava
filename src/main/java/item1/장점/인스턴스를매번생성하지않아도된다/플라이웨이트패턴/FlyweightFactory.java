package item1.장점.인스턴스를매번생성하지않아도된다.플라이웨이트패턴;

import java.util.HashMap;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * FlyweightFactory.
 *
 * <p>
 *  FlyWeight 객체의 캐시 관리 및 인스턴스 반환을 담당하는 팩토리 클래스.
 * </p>
 *
 * @author : middlefitting
 * @see FlyWeight
 * @since : 2023/10/21
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FlyweightFactory {

  /**
   * FlyWeight를 보관하는 맵, 정적 팩터리의 캐시와 같은 역할을 한다.
   */
  private static final HashMap<Short, FlyWeight> flyweights = new HashMap<>();


  /**
   * <p>
   *  플라이 웨이트 객체를 반환하는 정적 팩터리 메서드.
   *  <br/>
   *  플라이 웨이트 패턴은 상태를 불변으로 고정해서 사용하는 경우가 많다.
   *  객체를 미리 많이 보유하고 빠르게 같은 객체를 반환해주는 것이다.
   *  <br/>
   *  객체를 많이 보유하는게 효율적인지 판단해야 한다. 잘 사용하면 아주 좋은 전략이 될 것이다.
   * </p>
   *
   * @param health
   * @return FlyWeight
   * @throws
   */
  public static FlyWeight getFlyWeight(short health) {
    FlyWeight flyWeight = flyweights.get(health);
    if (flyWeight == null) {
      flyWeight = new FlyWeight(health);
      flyweights.put(health, flyWeight);
    }
    return flyWeight;
  }
}
