package item1.장점.인스턴스를매번생성하지않아도된다.인스턴스캐시;

import java.util.HashMap;
import java.util.Map;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

/**
 * CacheInstance.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/10/21
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CacheInstance {

  /**
   * 캐시 인스턴스
   */
  private static final Map<CacheType, CacheInstance> INSTANCE = new HashMap<>();

  /**
   * 캐시 타입 멤버
   */
  private CacheType type;


  /**
   * 캐시 인스턴스 생성
   */
  static {
    for (CacheType i : CacheType.values()) {
      INSTANCE.put(i, new CacheInstance(i));
    }
  }


  /**
   * <p>
   *  타입을 바탕으로 캐시 인스턴스를 반환.
   * </p>
   *
   * @param type 캐시 타입
   * @return CacheInstance
   * @throws
   */

  public static CacheInstance getInstance(CacheType type) {
    return INSTANCE.get(type);
  }


  /**
   * <p>
   *  인스턴스의 CacheType 반환.
   * </p>
   *
   * @param
   * @return CacheType
   * @throws
   */

  public CacheType getType() {
    return this.type;
  }
}
