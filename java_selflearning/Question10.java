import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class StreamStats {
    public static void main(String[] args) {

        IntStream stream = IntStream.rangeClosed(1, 10);

        System.out.println("Sum = " + stream.sum());

        // recreate stream (streams can't be reused)
        IntSummaryStatistics stats = IntStream.rangeClosed(1, 10)
                .summaryStatistics();

        System.out.println("Count = " + stats.getCount());
        System.out.println("Min = " + stats.getMin());
        System.out.println("Max = " + stats.getMax());
        System.out.println("Average = " + stats.getAverage());
    }
}
