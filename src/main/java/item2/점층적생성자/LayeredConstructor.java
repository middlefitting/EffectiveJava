package item2.점층적생성자;

/**
 * LayeredConstructor.
 *
 * <p>
 *  점층적 생성자는 선택적 매개변수가 존재할때 아래와 같이 매개변수를 하나씩 추가해가며 생성자를 만드는 방식이다.
 *  이 방식은 매개변수가 많아지면 클라이언트 코드를 작성하기 어렵다.
 *  매개변수가 3개만 되도 아래와 같이 비효율적인 코드가 된다.
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/10/25
 */
public class LayeredConstructor {

  private String name;
  private int age;

  private String address;

  public LayeredConstructor(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public LayeredConstructor(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public LayeredConstructor(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public LayeredConstructor(int age, String address) {
    this.age = age;
    this.address = address;
  }

  public LayeredConstructor(String name) {
    this.name = name;
  }

  public LayeredConstructor(int age) {
    this.age = age;
  }

  // 자료형이 같아 정의도 못한다
  //  public LayeredConstructor(String address) {
  //    this.address = address;
  //  }

  public LayeredConstructor() {
  }
}
