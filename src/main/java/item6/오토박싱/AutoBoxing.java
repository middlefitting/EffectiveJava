package item6.오토박싱;

/**
 * AutoBoxing.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/11/17
 */
public class AutoBoxing {

    public static void main(String[] args) {
      // 오토박싱
      Long start = System.currentTimeMillis();
      Long sum = 0L;
      for (long i = 0; i < Integer.MAX_VALUE; i++) {
        sum += i;
      }
      Long end = System.currentTimeMillis();
      System.out.println("걸린 시간 : " + (end - start) + "ms");

      // 오토박싱
      start = System.currentTimeMillis();
      long sum1 = 0L;
      for (long i = 0; i < Integer.MAX_VALUE; i++) {
        sum1 += i;
      }
      end = System.currentTimeMillis();
      System.out.println("걸린 시간 : " + (end - start) + "ms");    }
}
