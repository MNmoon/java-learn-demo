package Objcet;

import org.junit.jupiter.api.Test;

import javax.xml.stream.StreamFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class streamDemoTest {

    @Test
    void firstTest(){
        ArrayList<String> strArr =  new ArrayList<>();
        strArr.add("first");
        strArr.add("second");
        strArr.add("list");

        List<Integer> list = strArr.stream().map(String::length).collect(Collectors.toList());
        System.out.println("length: " + list);



        ArrayList<Integer> intArry =  new ArrayList<>();
        intArry.add(1);
        intArry.add(2);
        intArry.add(3);
        intArry.add(4);

        //筛选出 大于2的元素
        List<Integer> collect =  intArry.stream().filter(i -> i > 2).collect(Collectors.toList());
        System.out.println(collect);
    }



}