package tudelft.numfinder;

public class NumFinder {
    private int smallest = Integer.MAX_VALUE;
    private int largest = Integer.MIN_VALUE;

    public void find(int[] numbers) {
        // reset results
        smallest = Integer.MAX_VALUE;
        largest = Integer.MIN_VALUE;

        if (numbers == null || numbers.length == 0) {
            return;
        }

        for (int n : numbers) {
            if (n < smallest)
                smallest = n;
            if (n > largest)
                largest = n;
        }
    }

    public int getSmallest() {
        return smallest;
    }

    public int getLargest() {
        return largest;
    }
}
