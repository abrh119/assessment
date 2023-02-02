import java.util.LinkedList;

public class MovingTotal {
    /**
     * Adds/appends list of integers at the end of internal list.
     */
    LinkedList<Integer> container = new LinkedList<Integer>();
    public void append(int[] list) {

        for (int i = 0; i < list.length; i++) {

            container.add(i, new Integer(list[i]));
        }
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    /**
     * Returns boolean representing if any three consecutive integers in the
     * internal list have given total.
     */
    public boolean contains(int total) {

        // first element
        for (int i = 0; i < container.size(); i++) {

            // second element
            for (int j = i + 1; j < container.size() ; j++) {

                // third element
                for (int k = j + 1; k < container.size(); k++) {
                    if (container.get(i) + container.get(j) + container.get(k) == total) {
                        return true;
                    }
                }
            }
        }
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        MovingTotal movingTotal = new MovingTotal();

        movingTotal.append(new int[] { 1, 2, 3, 4 });

        System.out.println(movingTotal.contains(6));
        System.out.println(movingTotal.contains(9));
        System.out.println(movingTotal.contains(12));
        System.out.println(movingTotal.contains(7));

        movingTotal.append(new int[] { 5 });

        System.out.println(movingTotal.contains(6));
        System.out.println(movingTotal.contains(9));
        System.out.println(movingTotal.contains(12));
        System.out.println(movingTotal.contains(7));
    }
}
