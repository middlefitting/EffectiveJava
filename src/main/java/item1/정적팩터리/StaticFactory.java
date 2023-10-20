package item1.정적팩터리;

/**
 * StaticFactory.
 *
 * @author : middlefitting
 * @since : 2023/10/20
 */
public class StaticFactory {
  /**
   * 기본적으로인스턴스를 얻는 수단, public 생성자.
   */
  public StaticFactory() {
  }

  /**
   * 정적 팩터리 메서드.
   * @return StaticFactory
   */
  public static StaticFactory getNewInstance() {
    return new StaticFactory();
  }
}
