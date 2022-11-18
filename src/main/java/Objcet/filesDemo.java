package Objcet;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class filesDemo {

    public static void main(String[] args) throws IOException {
        String rootPath = "D:\\logs";
        String path = "D:\\logs\\test01";
        String file = "D:\\logs\\test.txt";
        String file01 = "D:\\logs\\test01\\tee.txt";
        Files.createDirectories(Paths.get(path));
        Files.createFile(Paths.get(file));
        Files.createFile(Paths.get(file01));
//
//        //判断文件是否存在
//        boolean exist = Files.exists(Paths.get(path));
//        if (exist) {
//            System.out.println("存在： " + exist);
//        }else {
//            System.out.println("不存在!");
//        }
//        boolean notExist = Files.notExists(Paths.get(path));
        //删除文件夹 不为空的情况下报错
//        Files.deleteIfExists(Paths.get(path));
        //删除test01\\tee.txt
        Files.deleteIfExists(Paths.get(file01));
        //删除 D:\logs\test.txt
        Files.deleteIfExists(Paths.get(file));
        //删除D:\logs\\test01
        Files.deleteIfExists(Paths.get(path));

        List<String> list = new ArrayList<>();
        list.add("this is title");
        list.add("this is content");
        //追加 如果文件不存在就创建
        String newFile = "D:\\logs\\test01.txt";
        Files.write(Paths.get(newFile), list, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        Files.write(Paths.get(file), "this is context".getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);

        //读取文件 指定字符集
        List<String> list1 = Files.readAllLines(Paths.get(newFile), StandardCharsets.UTF_8);
        List<String> list2 = Files.readAllLines(Paths.get(newFile), Charset.forName("UTF-8"));
        List<String> list3 = Files.readAllLines(Paths.get(newFile), Charset.defaultCharset());
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        //递归删除文件夹及其子文件 rootPath = D:\\logs
        Files.walk(Paths.get(rootPath))
                //skip跳过  意思是不删除D盘下第一层文件夹  这里指的是logs
//                .skip(1)
                .sorted(Comparator.reverseOrder())
                .map(Path::toFile)
                .forEach(File::delete);

        boolean exist = Files.exists(Paths.get(rootPath));
        if (exist) {
            System.out.println("rootPath存在");
        }else {
            System.out.println("rootPath不存在");
        }

    }


}
