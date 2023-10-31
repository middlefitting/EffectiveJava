package item2.제네릭.언바운드와일드카드타입;

import java.util.List;

/**
 * UnboundWildcardType.
 *
 * <p>
 *  ?는 어떤 타입이든 받을 수 있다.
 *  <br>
 *  따라서 당연히 어떤 타입이든 받을 수 있는 경우에 사용하면 된다.
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/10/31
 */
public class UnboundWildcardType {

  /**
   * 언바운드 와일드카드 타입을 사용한 메서드.
   * @param toPrint
   */
  public void unbound(List<?> toPrint) {
    // 타입에 의존적이지 않은 로직
    for (Object o : toPrint) {
      // println 메서드는 Object 타입을 받는다.
      System.out.println(o);
    }
  }
}
