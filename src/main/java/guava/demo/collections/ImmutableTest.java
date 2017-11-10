package guava.demo.collections;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/**
 * @author SEELE
 * @date 2017/11/11
 */
public class ImmutableTest {
    public static void main(String[] args) {
        ImmutableSet<String> resultSet = ImmutableSet.of("I","LOVE","JAVA");
        ImmutableList<String> resultList = ImmutableList.of("1","2","3");
    }
}
