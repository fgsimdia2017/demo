package com.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author huangfeng
 * @Date 2023/11/27 17:13
 * @description
 * @Version 1.0
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ChildTest extends TestParent{
    private String name;
    private Long currencyId;
    public static void t(){
        ChildTest.builder()
                .build();
    }

    public static void main(String[] args) {
        final ArrayList<ChildTest> list = new ArrayList<>();
        final ChildTest childTest = new ChildTest();
        childTest.setName("1");
        childTest.setCurrencyId(1L);
        final ChildTest childTest2 = new ChildTest();
        childTest2.setCurrencyId(2L);
        list.add(childTest);
        list.add(childTest2);
        final Map<Long, String> map = list.stream()
                .filter(item->item.getName()!=null)
                .collect(Collectors.toMap(ChildTest::getCurrencyId, ChildTest::getName, (key1, key2) -> key2));

        System.out.println(map);
    }
}
