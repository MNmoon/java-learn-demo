package Objcet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mapStream {
    public static void main(String[] args) {
            List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
            Map<String,Object> mapOne = new HashMap<>();
            mapOne.put("id",1 );
            mapOne.put("name","小野光" );
            mapOne.put("age",24 );
            mapOne.put("address","静岡県静岡市駿河区" );
            list.add(mapOne);

            Map<String,Object> mapTwo = new HashMap<>();
            mapTwo.put("id",2 );
            mapTwo.put("name","石井真畿" );
            mapTwo.put("age",18 );
            mapTwo.put("address","東京都上野" );
            list.add(mapTwo);

            //使用Stream流遍历过滤Map集合
            List<String> listStr =  list.stream().map(item -> item.get("name").toString()).collect(Collectors.toList());
            System.out.println(listStr);

            //使用Stream流遍历指定变量并组成新的集合
            SeatFsVo seatFsVo = new SeatFsVo();
            seatFsVo.setName("小塔");
            seatFsVo.setAge(18);
            seatFsVo.setExplicitNumber("13007575998");// 联系方式一
            seatFsVo.setExplicitNumber2("1300757591");// 联系方式二

//            List<String> expList = Stream.of(seatFsVo.getExplicitNumber(), seatFsVo.getExplicitNumber2()).filter(item -> StringUtils.isNotEmpty(item)).collect(Collectors.toList());
//            System.out.println(expList);

    }

    }

