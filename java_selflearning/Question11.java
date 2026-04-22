public class GenericMin {

    public static <T extends Number> double findMin(T[] arr) {
        double min = arr[0].doubleValue();

        for (T val : arr) {
            if (val.doubleValue() < min)
                min = val.doubleValue();
        }
        return min;
    }

    public static void main(String[] args) {
        Integer[] arr = {10, 5, 20, 3};

        System.out.println("Min = " + findMin(arr));
    }
}
