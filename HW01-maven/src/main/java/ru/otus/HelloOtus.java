package ru.otus;

import com.google.common.collect.Lists;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;

import java.util.List;

public class HelloOtus {
    public static void PrintLists () {
        List<String> example2 = Lists.newArrayList();
        example2.add("January");
        example2.add("February");
        example2.add("March");
        List<String> result2 =Lists.newArrayList();
        result2.addAll(Collections2.filter(example2, Predicates.containsPattern("^J")));
        System.out.println(result2);
    }
}
