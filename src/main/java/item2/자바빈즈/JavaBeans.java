package item2.자바빈즈;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * JavaBeans.
 *
 * <p>
 *  자바 빈즈 패턴은 생성자로 객체를 만든 후 setter 메서드를 통해 값을 설정하는 방식이다.
 *  점층적 생성자 패턴과 비교했을 때 일관성은 있다.
 *  하지만 불변성이 보장되지 않으며, 스레드 안정성을 위해서는 추가적인 노력이 들어간다.
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/10/25
 */
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JavaBeans {
  private String name;
  private int age;
  private String address;
}
