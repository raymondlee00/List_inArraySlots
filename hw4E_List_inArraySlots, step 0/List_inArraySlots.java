/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    private int[] intArr;
    private int length = 2;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
      intArr = new int[2];
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
      return this.length;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
      String str = "";
      int i = 0;
      while (i < this.length) {
        str += this.intArr[i];
        if (i != this.length - 1) {
        	str += ", ";
        }
        i++;
      }
      return "[" + str + "]";
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {
      this.expand();
      int i = 0;
      while (i < this.length - 1) {
        if (this.intArr[i] == 0) {
          this.intArr[i] = value;
        }
        i++;
      }
      return true;
     }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data
     */
     private void expand() {
        System.out.println( "expand... (for debugging)");
           /* S.O.P. rules for debugging:
              Working methods should be silent. But during
              development, the programmer must verify that
              this method is called when that is appropriate.
              So test using the println(), then comment it out.
              */
        int[] dummyArr = new int[this.length * 2];
        int i = 0;
        while (i < this.length) {
          dummyArr[i] = this.intArr[i];
          i++;
        }
        this.intArr = dummyArr;
        this.length *= 2;
     }
}
