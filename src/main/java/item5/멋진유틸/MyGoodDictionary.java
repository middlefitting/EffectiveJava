package item5.멋진유틸;

import java.util.HashMap;

/**
 * MyGoodDictionary.
 *
 * <p>
 *  제네릭을 통한 가변적인 딕셔너리가 된다.
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/11/14
 */
public class MyGoodDictionary<T> {
  private final HashMap<T, String> dictionary;

  private MyGoodDictionary(HashMap<T, String> dictionary) {
    this.dictionary = dictionary;
  }

  public boolean isContain(T word) {
    return dictionary.containsKey(word);
  }
}
