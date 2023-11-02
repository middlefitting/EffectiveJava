package item3.싱글턴.싱글톤직렬화;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * SerializeSingletonTest.
 *
 * <p>
 *  객체를 직렬화하고 다시 역직렬화 하였을때 같은 객체가 반환된다
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/11/02
 */
class SerializeSingletonTest {
  @Test
  @DisplayName("역직렬화시 같은 인스턴스 검증")
  void test() throws IOException, ClassNotFoundException {

    //Arrange
    SerializeSingleton serializeSingleton = SerializeSingleton.getInstance();
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializeSingleton.ser"));
    oos.writeObject(serializeSingleton);
    oos.close();
    //Act
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serializeSingleton.ser"));
    SerializeSingleton serializeSingleton2 = (SerializeSingleton) ois.readObject();
    ois.close();
    //Assert
    assertEquals(serializeSingleton, serializeSingleton2);
    new File("serializeSingleton.ser").delete();
  }
}