package item3.싱글턴.정적팩터리.리플렉션방지;

/**
 * ReflectionGuard.
 *
 * <p>
 *  리플렉션이 생성자를 호출하는 것을 방지하여 싱글턴을 보장한다.
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/11/02
 */
public class ReflectionGuard {
  private static ReflectionGuard INSTANCE = null;
  private static boolean instanceCreated = false;


  /**
   * <p>
   *  ReflectionGuard 생성자
   *  ReflectionGuard 클래스가 이미 생성되었는지 확인하고, 생성되었다면 예외를 던진다.
   * </p>
   *
   * @param
   * @return
   * @throws
   */

  private ReflectionGuard() {
    // 동기화 블록을 사용하여 동시 접근을 막는다.
    synchronized (ReflectionGuard.class) {
      if (instanceCreated) {
        throw new IllegalStateException("이미 생성된 인스턴스가 존재합니다.");
      }
      INSTANCE = this;
      instanceCreated = true;
    }
  }

  public static ReflectionGuard getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new ReflectionGuard();
    }
    return INSTANCE;
  }
}
