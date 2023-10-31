package item2.제네릭.재귀적타입바운드;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * RecursiveTypeComparable.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/10/31
 */
//public class RecursiveTypeComparable <T extends Comparable<T>> {
//    private int num;
//
//    public int compareTo(T o) {
//        return num - o.compareTo(o);
//    }
//}

@Getter
@AllArgsConstructor
public class RecursiveTypeComparable<T extends Comparable<T>> implements
    Comparable<RecursiveTypeComparable<T>> {

  private int num;

  @Override
  public int compareTo(RecursiveTypeComparable<T> o) {
    return num - o.getNum();
  }

}

/**
 * 해당 예시가 잘못된 예시인 이유는 재귀적 타입 바운드를 사용하지 않았기 떄문이다.
 * 재귀적 타입 바운드를 사용하려면 Comparable 인터페이스를 구현한 클래스를 사용해야 한다.
 */
//@Getter
//class Me <T extends Comparable> implements Comparable<T>{
//  private int num;
//
//  @Override
//  public int compareTo(T o) {
//    return num - o.getNum();
//  }
//}