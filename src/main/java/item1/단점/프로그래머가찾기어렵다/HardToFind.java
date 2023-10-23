package item1.단점.프로그래머가찾기어렵다;

/**
 * HardToFind.
 *
 * <p>
 *  프로그래머가 찾기 어렵다.
 *  API 사용자는 정적 팩터리를 사용해야 하는 것도 모를 수 있다.
 *  public 생성자가 있다면 API 사용자는 무조건 생성자를 사용하게 될 것이다.
 *  <br>
 *  API 문서를 잘 작성하여 정적 팩터리 방식의 클래스를 사용하도록 유도하자.
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/10/23
 */
public interface HardToFind {

  /**
   * 매개변수를 하나 받는 정적 팩터리 메서드
   * @param name
   * @return HardToFind
   */
  HardToFind from(String name);

  /**
   * 매개변수를 두 개 이상 받는 정적 팩터리 메서드
   * @param name
   * @param age
   * @return HardToFind
   */
  HardToFind of(String name, String age);

  /**
   * from과 of의 자세한 버전
   * @param name
   * @param age
   * @return HardToFind
   */
  HardToFind valueOf(String name, String age);

  /**
   * 인스턴스를 반환하는 단순한 정적 팩터리 메서드, 같은 인스턴스를 보장하지는 않는다.
   * @param name
   * @return HardToFind
   */
  HardToFind instance(String name);

  /**
   * 인스턴스를 반환하는 단순한 정적 팩터리 메서드, 같은 인스턴스를 보장하지는 않는다.
   * @param name
   * @return HardToFind
   */
  HardToFind getInstance(String name);

  /**
   * 새로운 인스턴스를 반환함을 보장한다.
   * @param name
   * @return HardToFind
   */
  HardToFind create(String name);

  /**
   * 새로운 인스턴스를 반환함을 보장한다.
   * @param name
   * @return HardToFind
   */
  HardToFind newInstance(String name);

  /**
   * getInstance와 같지만 클래스가 아닌 다른 클래스의 팩터리 메서드 정의
   * @param name
   * @return Boolean
   */
  Boolean getType(String name);

  /**
   * newInstance와 같지만 클래스가 아닌 다른 클래스의 팩터리 메서드 정의
   * @param name
   * @return Boolean
   */
  Boolean newType(String name);

  /**
   * getType과 newType의 간결한 버전
   * @param name
   * @return Boolean
   */
  Boolean type(String name);
}
