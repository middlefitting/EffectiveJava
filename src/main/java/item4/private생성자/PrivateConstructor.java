package item4.private생성자;

/**
 * private 생성자를 사용하여 인스턴스화를 방지하자.
 *
 * <p>
 *  실수로 생성자를 호출하였을 경우 방어를 위해 에러를 던진다.
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/11/09
 */
public class PrivateConstructor {
  private PrivateConstructor() {
    throw new AssertionError();
  }

  public static void hello() {
    System.out.println("hello");
  }
}
