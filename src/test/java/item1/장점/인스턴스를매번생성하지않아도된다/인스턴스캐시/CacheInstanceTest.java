package item1.장점.인스턴스를매번생성하지않아도된다.인스턴스캐시;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * CacheInstanceTest.
 *
 * <p>
 *  인스턴스 캐시 테스트
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/10/21
 */
@DisplayName("인스턴스 캐시 테스트")
class CacheInstanceTest {

  @Test
  @DisplayName("캐시를 통한 인스턴스 생성 테스트")
  void instanceCacheTest() {
    //Arrange
    CacheInstance instance1_1 = CacheInstance.getInstance(CacheType.INSTANCE1);
    CacheInstance instance1_2 = CacheInstance.getInstance(CacheType.INSTANCE1);

    CacheInstance instance2_1 = CacheInstance.getInstance(CacheType.INSTANCE2);
    CacheInstance instance2_2 = CacheInstance.getInstance(CacheType.INSTANCE2);

    CacheInstance instance3_1 = CacheInstance.getInstance(CacheType.INSTANCE3);
    CacheInstance instance3_2 = CacheInstance.getInstance(CacheType.INSTANCE3);

    //Act
    CacheType whoAmI = instance1_1.getType();
    CacheType whoAmI2 = instance2_1.getType();
    CacheType whoAmI3 = instance3_1.getType();

    Boolean isSameInstance1 = instance1_1 == instance1_2;
    Boolean isSameInstance2 = instance2_1 == instance2_2;
    Boolean isSameInstance3 = instance3_1 == instance3_2;

    //Assert
    assertEquals(CacheType.INSTANCE1, whoAmI);
    assertEquals(CacheType.INSTANCE2, whoAmI2);
    assertEquals(CacheType.INSTANCE3, whoAmI3);

    assertTrue(isSameInstance1);
    assertTrue(isSameInstance2);
    assertTrue(isSameInstance3);
  }
}