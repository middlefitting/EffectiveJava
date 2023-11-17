package item6.극단적인예시;

/**
 * WhatThe.
 *
 * <p>
 *  정말 잘못된 예시를 다룬다.
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/11/17
 */
public class WhatThe {

  /**
   * String 인스턴스를 재사용하지 않는다.
   */
  public String giveMeString() {
    return new String("what the");
  }

  /**
   * String 인스턴스를 재사용한다.
   */
  public String giveMeString2() {
    return "what the";
  }
}
