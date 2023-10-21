package item1.장점.인스턴스를매번생성하지않아도된다.인스턴스미리생성;

/**
 * PrepareInstance.
 * <p>
 * 인스턴스를 미리 준비하는 방법. 클래스 변수에 불변 인스턴스를 미리 생성해두고, 필요할 때마다 이 인스턴스를 반환하는 방법.
 * </p>
 *
 * @author : middlefitting
 * @since : 2023/10/21
 */
public class PrepareInstance {

  private static final PrepareInstance INSTANCE = new PrepareInstance();

  /**
   * 생성자 캡슐화
   */
  private PrepareInstance() {

  }

  /**
   * 미리 생성된 클래스 멤버 인스턴스 반환.
   * @return PrepareInstance
   */
  public static PrepareInstance getInstance() {
    return INSTANCE;
  }
}
