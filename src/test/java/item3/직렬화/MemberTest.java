package item3.직렬화;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.util.SerializationUtils;

/**
 * MemberTest.
 *
 * <p>
 *  직렬화는 어떻게 사용하는지 알아보자.
 *  자바에서는 라이브러리가 이미 잘 나와 있어 이렇게 할 일이 거의 없기는 하다.
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/11/01
 */
@DisplayName("직렬화")
class MemberTest {
  @Test
  @DisplayName("CSV 직렬화 테스트")
  void csvTest() {
      //Arrange
      Member member = new Member("middlefitting", "middlefitting@gmail.com", 27);
      //Act
    String csv = String.format("%s,%s,%d", member.getName(), member.getEmail(), member.getAge());
      //Assert
    System.out.println(csv);
  }

  @Test
  @DisplayName("JSON 직렬화 테스트")
  void jsonTest() {
    //Arrange
    Member member = new Member("middlefitting", "middlefitting@gmail.com", 27);
    //Act
    String json = String.format("{\"name\":\"%s\",\"email\":\"%s\",\"age\":%d}", member.getName(), member.getEmail(), member.getAge());
    //Assert
    System.out.println(json);
  }

  @Test
  @DisplayName("SerializationUtils 이진 직렬화 테스트")
  void serializationUtilsBinaryTest() {
    //Arrange
    Member member = new Member("middlefitting", "middlefitting@gmail.com", 27);
    //Act
    byte[] serializedMember = SerializationUtils.serialize(member);
    //Assert
    System.out.println(serializedMember);
  }


  @Test
  @DisplayName("ByteArrayOutputStream 이진 직렬화 테스트")
  void byteArrayOutputStreamBinaryTest() throws IOException {
    //Arrange
    Member member = new Member("middlefitting", "middlefitting@gmail.com", 27);
    //Act
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    baos.write(member.toString().getBytes());
    byte[] serializedMember = baos.toByteArray();
    //Assert
    System.out.println(serializedMember);
  }
}