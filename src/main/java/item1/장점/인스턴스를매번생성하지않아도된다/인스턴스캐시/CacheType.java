package item1.장점.인스턴스를매번생성하지않아도된다.인스턴스캐시;

/**
 * CacheType.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/10/21
 */
public enum CacheType {
  INSTANCE1,
  INSTANCE2,
  INSTANCE3;

  public static int getTypeCount() {
    return CacheType.values().length;
  }
}
