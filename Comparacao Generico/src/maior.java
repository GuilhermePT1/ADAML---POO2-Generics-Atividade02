public class maior {

    public static <T extends Comparable<T>> T maior(T a, T b) {
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }
}