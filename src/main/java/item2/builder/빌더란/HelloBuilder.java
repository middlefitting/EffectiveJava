package item2.builder.빌더란;

import lombok.Getter;

/**
 * HelloBuilder.
 *
 * <p>
 *  빌더 패턴.
 *  점층적 생성자 패턴의 안정성과 자바빈즈 패턴의 가독성을 겸비한 패턴이다.
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/10/25
 */
@Getter
public class HelloBuilder {

  private final String name;
  private final int age;
  private final String address;

  public static class Builder {

    /**
     * 필수 인자
     */
    private final String name;

    private int age = 20;
    private String address = "Seoul";

    /**
     * 필수 인자만 받는 생성자
     */
    public Builder(String name) {
      this.name = name;
    }

    /**
     * 선택적 인자를 받는 메서드
     * this를 반환함으로써 메서드 체이닝을 지원한다.
     */
    public Builder age(int age) {
      this.age = age;
      return this;
    }


    /**
     * 선택적 인자를 받는 메서드
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }

    /**
     * 빌더 객체를 생성자에 넘긴다.
     */
    public HelloBuilder build() {
      return new HelloBuilder(this);
    }
  }

  /**
   * 빌더 객체를 받는 생성자
   */
  private HelloBuilder(Builder builder) {
    this.name = builder.name;
    this.age = builder.age;
    this.address = builder.address;
  }
}
