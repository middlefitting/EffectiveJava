package item6.불변클래스의정적팩터리;

/**
 * UseStaticFactory.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/11/17
 */
public class UseStaticFactory {

  public static void main(String[] args) {
    // 권장되지 않는 구조
    Boolean a = new Boolean(true);
    // 권장되는 구조
    Boolean b = Boolean.valueOf(true);
  }
}
