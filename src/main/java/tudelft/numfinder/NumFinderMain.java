package tudelft.numfinder;

public class NumFinderMain {

    public static void main(String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        nf.find(new int[]{4, 25, 7, 9});
        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());

        // this crashed
        nf.find(new int[]{4, 3, 2, 1});
        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());

        // this should probably throw an exception
        nf.find(null);
        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());
    }
}
