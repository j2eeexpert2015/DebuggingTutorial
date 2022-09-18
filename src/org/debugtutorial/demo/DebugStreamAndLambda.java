package org.debugtutorial.demo;

import java.util.Arrays;
import java.util.stream.Stream;

public class DebugStreamAndLambda
{
    public static void main(String[] args)
    {
        String[] strArray = { "x", "y", "xyz","z", "b","c","a","d","abc","pqr" };
        System.out.println(Arrays.toString(strArray));
        Object[] outputStrArray = Stream.of(strArray).map(item -> item.toUpperCase())
        		.filter(elem -> elem.length()==1)
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(outputStrArray));
    }
}
