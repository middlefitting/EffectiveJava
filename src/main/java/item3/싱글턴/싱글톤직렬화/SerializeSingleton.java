package item3.싱글턴.싱글톤직렬화;

import java.io.Serializable;
import lombok.NoArgsConstructor;

/**
 * SerializeSingleton.
 *
 * <p>
 *  Serializable는 직렬화가 가능하다는 것을 JVM에 알려주는 역할을 한다.
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/11/02
 */
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class SerializeSingleton implements Serializable {
  private static final SerializeSingleton INSTANCE = new SerializeSingleton();

  public static SerializeSingleton getInstance() {
    return INSTANCE;
  }

  /**
   * 직렬화된 인스턴스를 반환하는 메서드, 이 메서드가 없으면 역직렬화된 인스턴스는 새로운 인스턴스가 된다.
   * 역직렬화시 이를 자동으로 호출하게 된다.
   * 싱글톤 패턴에서 주로 사용한다
   * @return
   */
  private Object readResolve() {
    return INSTANCE;
  }
}
