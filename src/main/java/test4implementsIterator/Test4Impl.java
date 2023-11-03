package test4implementsIterator;

import com.google.common.collect.Lists;
import test4staticExtends.B;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author by woyuan  2023/3/21
 */
public class Test4Impl implements Iterable {
    static final List<Integer> list = Lists.newArrayList();
    static {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {

            @Override
            public boolean hasNext() {
                return Boolean.TRUE;
            }

            @Override
            public Integer next() {
                return list.get(0);
            }

            @Override
            public void remove() {
//                throw new UnsupportedOperationException();
            }

        };
    }
}
