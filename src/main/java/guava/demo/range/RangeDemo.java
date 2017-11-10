package guava.demo.range;

import com.google.common.collect.BoundType;
import com.google.common.collect.Range;

/**
 * @author SEELE
 * @date 2017/11/11
 */
public class RangeDemo {
    public static void main(String[] args) {
        Range<Integer> range = Range.closed(1,3);
        /*System.out.println(range.isEmpty());
        System.out.println(range.lowerBoundType());
        System.out.println(range.upperBoundType());
        System.out.println(range.contains(2));
        System.out.println(range.hasLowerBound());
        System.out.println(range.hasUpperBound());
        System.out.println(range.lowerEndpoint());
        System.out.println(range.upperEndpoint());*/
        Range<Integer> range1 = Range.closed(2,6);
        System.out.println(range1.intersection(range));
        System.out.println(range.encloses(range1));
        System.out.println(range.isConnected(range1));
        System.out.println(Range.closed(1, 5).isConnected(Range.closed(5, 10)));
    }
}
