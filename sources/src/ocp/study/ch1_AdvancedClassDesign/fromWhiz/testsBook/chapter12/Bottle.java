package ocp.study.ch1_AdvancedClassDesign.fromWhiz.testsBook.chapter12;

/**
 * @Author matus.korenek
 * @Date 6.1.2018
 */
public class Bottle {
      public static class Ship {
            private enum Sail {
                  TALL {protected  int getHeight() {return  100;} },
                  SHORT {protected  int getHeight() {return  2;} };
                  protected abstract int getHeight();
            }

            public Sail getSail() {
                  return Sail.TALL;
            }
            
            public Sail getShortSail() {
                  return Sail.SHORT;
            }
                  
      }
      public static void main(String ...unused) {
            Bottle bottle = new Bottle();
            Ship q = new Ship();
            System.out.print(q.getSail().getHeight());
            System.out.print(q.getShortSail());
      }
}
