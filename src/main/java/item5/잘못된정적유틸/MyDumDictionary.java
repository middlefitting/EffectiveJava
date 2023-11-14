package item5.잘못된정적유틸;

import java.util.HashMap;
import java.util.List;

/**
 * SpellChecker.
 *
 * <p>
 *  잘못된 정적 유틸리티 클래스
 *  여러 자료형의 사전을 사용하고 싶을때는 적절하지 않을 수 있다.
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/11/14
 */
public class MyDumDictionary {
  private static final HashMap<String, String> dictionary = new HashMap<>();

  private MyDumDictionary() {
    throw new AssertionError();
  }

  public static boolean isContain(String word) {
    return dictionary.containsKey(word);
  }
}
