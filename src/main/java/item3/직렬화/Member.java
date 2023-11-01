package item3.직렬화;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Member.
 *
 * <p>
 *  직렬화란 무엇인지 테스트 코드를 통해 간단하게 알아보자
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/11/01
 */
@AllArgsConstructor
@Getter
public class Member implements Serializable {
  private String name;
  private String email;
  private int age;
}
