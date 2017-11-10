package guava.demo.stringutils;

import com.google.common.base.Splitter;

import java.util.List;

/**
 * @author SEELE
 * @date 2017/11/10
 */
public class StringSplitter {

    public static void main(String[] args) {
//        测试对于输入字符串带空格的处理
        String testString = "..www. google . com . . ";
//        根据字符来拆分字符串
        Splitter splitter = Splitter.on(".");
//        根据长度来拆分
        Splitter fixSplitter = Splitter.fixedLength(3);
//        原始字符串
        List<String> originResult = splitter.splitToList(testString);
//        不带空格的结果
        List<String> noSpaceResult = splitter.trimResults().splitToList(testString);
//        不带空字符串的结果
        List<String> noNullStringResult = splitter.omitEmptyStrings().splitToList(testString);
//        既没有空格，也没有空字符串的结果，
        List<String> exceptResult = splitter.omitEmptyStrings().trimResults().splitToList(testString);
//        限制拆分的大小，注意如果去空的话空部分不算入总数，去空格的话每一个元素都会被去除前后空格
        List<String> limitResult = splitter.omitEmptyStrings().trimResults().limit(2).splitToList(testString);
//        根据长度拆分，去掉前后空格仍有用
        List<String> fixedLengthResult = fixSplitter.trimResults().splitToList(testString);
        System.out.println(originResult.toString());
        System.out.println(noSpaceResult.toString());
        System.out.println(noNullStringResult.toString());
        System.out.println(exceptResult.toString());
        System.out.println(limitResult.toString());
        System.out.println(fixedLengthResult.toString());


    }
}
