package set;

import com.google.common.collect.Sets;

import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> sets = Sets.newHashSet();

        sets.add(null);
        sets.add(null);
        sets.add("hello");
        sets.add("hello");
        sets.add("hello2");

        for (String set : sets) {
            System.out.println(set);
        }
    }
}
