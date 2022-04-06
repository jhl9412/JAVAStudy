package com.test.exam06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExam {
    
    List<String> list = Arrays.asList("abcd","efg","hijk");

    Stream<String> listStream = list.stream();
    
}
