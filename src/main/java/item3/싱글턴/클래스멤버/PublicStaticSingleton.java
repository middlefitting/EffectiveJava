package item3.싱글턴.클래스멤버;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * PublicStaticSingleton.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/11/01
 */
@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@Getter
public class PublicStaticSingleton {
  public static final PublicStaticSingleton INSTANCE = new PublicStaticSingleton("middlefitting",
      "wjdtmdcjf2@gmail.com", 28);

  private String name;
  private String email;
  private int age;
}
