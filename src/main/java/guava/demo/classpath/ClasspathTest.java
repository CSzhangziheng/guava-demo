package guava.demo.classpath;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.ClassPath;

import java.util.Iterator;

/**
 * @author SEELE
 * @date 2017/11/11
 */
public class ClasspathTest {
    public static void main(String[] args) {
        try {
            ClassPath classPath = ClassPath.from(ClassLoader.getSystemClassLoader());
            ImmutableSet<ClassPath.ResourceInfo> infos = classPath.getResources();
            Iterator<ClassPath.ResourceInfo> it = infos.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
