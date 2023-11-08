package item4.private생성자.정적유틸리티클래스;

/**
 * 유틸 메서드를 제공하는 정적 클래스.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/11/09
 */
public class StaticUtilClass {
  private StaticUtilClass() {
    throw new AssertionError();
  }

  public static int add(int a, int b) {
    return a + b;
  }

  public static int subtract(int a, int b) {
    return a - b;
  }
}
