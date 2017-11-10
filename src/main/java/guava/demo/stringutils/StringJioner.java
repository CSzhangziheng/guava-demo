package guava.demo.stringutils;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import java.util.List;


/**
 * @author SEELE
 * @date 2017/11/11
 */
public class StringJioner {

    public static void main(String[] args) {
        Joiner joiner = Joiner.on(' ');
//        基本使用
        List<String> sourceList = Lists.asList("I",new String[]{"love","guava","very","much"});
        String result = joiner.join(sourceList);
        System.out.println(result);

        StringBuilder sb = new StringBuilder("I love guava");
        sb = joiner.appendTo(sb, new String[]{"very","much"});
        System.out.println(sb.toString());
    }
}
