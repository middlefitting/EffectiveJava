package item4.추상클래스만으로는인스턴스화를막을수없다;

import lombok.NoArgsConstructor;

/**
 * InstancePossible.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2023/11/09
 */
public abstract class InstancePossible {
  public void print() {
    System.out.println("InstancePossible");
  }

  public abstract void print2();
}

@NoArgsConstructor
class InstancePossibleImpl extends InstancePossible {

  @Override
  public void print2() {
    System.out.println("InstancePossibleImpl");
  }
}