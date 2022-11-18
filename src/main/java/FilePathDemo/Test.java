package FilePathDemo;

import jdk.dynalink.StandardOperation;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;

import static java.nio.file.Files.delete;
import static java.nio.file.Files.exists;
import static java.nio.file.Files.isExecutable;
import static java.nio.file.Files.isHidden;
import static java.nio.file.Files.isReadable;
import static java.nio.file.Files.isWritable;

public class Test {
    private static Path testDir;

    public static void main(String[] args) throws IOException {
/*        * 静态的Paths.get方法接受一个或多个字符串，并将他们用默认文件系统的路径分隔符
        * （类Unix文件系统是/，Windows是\）连接起来。然后解析连接起来的结果，
        * 如果其表示的不是给定文件系统中的合法路径，那么就抛出InvalidPathException异常。
        * 这个连接起来的结果就是一个Path对象。
        *
        //get  通过连接给定字符串  创建一个路径
        Path absolute = Paths.get("/Users", "acton_zhang");
        Path relative = Paths.get("pers", "zhang", "ThreadDemo.java");
        System.out.println("absolute: " + absolute);
        System.out.println("relative: " + relative);
        System.out.println("-----------------------");

        * 如果q是绝对路径，则结果就是q
        * 否则，根据文件系统的规则，将『p后面跟着q』作为结果
        * resolve方法有一种快捷方式，它接受一个字符串而不是路径：
        *


        //给定绝对路径  返回绝对路径:\bin
        System.out.println(absolute.resolve("/bin"));
        //给定相对路径 返回absolute + 字符串的路径: \Users\acton_zhang\bin
        System.out.println(absolute.resolve("bin"));
        System.out.println("-----------------------");
        Path basePath = Paths.get("/Users", "test");
        //\work
        Path workRelative = Paths.get("work");
        //resolve连接路径：\Users\test\work

        Path workPath = basePath.resolve(workRelative);
        System.out.println("workPath: " + workPath);
        //找到basePath同级目录的temp路径：\Users\test\temp
        Path siblingPath = basePath.resolveSibling("temp");
        System.out.println("siblingPath: " + siblingPath);

        //a.resolve(b) 则默认为a b拥有相同的顶级路径
        //以防万一，则加以判断
        System.out.println("-----------------判断absolute path--------------------");
        //绝对路径: \Users\zhang\test01
        Path a = Paths.get("Users","zhang","test01");
        //绝对路径: \Users\guo\test02
        Path b = Paths.get("Users","guo","test02");
        Path b2 = Paths.get("work");
        //如果b是一个绝对路径，那么a.resolve(b)的结果就不确定了 返回结果依赖于实现类
        System.out.println("when b is absolute path: " + concat(a, b));
        System.out.println("when b2 is not absolute path: " + concat(a, b2));

        //relativize  a到b的路径怎么走
        Path a1 = Paths.get ("/a/b/c");
        Path b1 = Paths.get ("/a/d");
        System.out.println("a -> b : " + a1.relativize(b1));

        Path a3 = Paths.get ("/a/b/c/test.txt");
        //返回路径中的文件名
        System.out.println(a3.getFileName());
        //返回根路径
        System.out.println(a3.getRoot());
        //返回父路径
        System.out.println(a3.getParent());
        //从该路径创建一个文件对象
        System.out.println(a3.toFile());
        //转换成绝对路径
        Path a4 = Paths.get("Test.java");
        System.out.println(a4.toAbsolutePath());
        //移除. ..等冗余路径
        System.out.println("a4 normalize " + a3.normalize());*/

//        Path text = Paths.get("test.txt");
        Path text = Paths.get("D:\\","test11\\learnDemo\\src\\main\\java\\FilePathDemo","test.txt");
        Path textPath = text.toAbsolutePath();
        System.out.println(textPath);
        //读取文件的所有内容
        byte[] bytes = Files.readAllBytes(textPath);
        System.out.println("bytes : " + bytes);
        //???
        String content1 = bytes.toString();
        System.out.println("bytes toString : " + content1);
        //将文件当作字符串读入
        String content = new String(bytes,Charset.defaultCharset());
        System.out.println("content : " + content);
        //将内容当一行输出,按行序列读入
        List<String> lines = Files.readAllLines(textPath,Charset.defaultCharset());
        lines.stream().forEach(System.out::println);
        System.out.println("lines : " + lines);
        String content3 = "if you care about what other people think";
        //向文件中追加内容
        Files.write(textPath,content3.getBytes(Charset.defaultCharset()),StandardOpenOption.APPEND) ;
        //将一个行的集合写出到文件中?
        Path path3 = Paths.get("D:\\","test11\\learnDemo\\src\\main\\java\\FilePathDemo","test01.txt");
        String lines1 = "sssss";
        Files.write(path3, lines1.getBytes());
        //处理的文件长度比较大，或者是二进制文件,流或者读入器/写出器
        InputStream in = Files.newInputStream(textPath);
        System.out.println("inputStream in: " + in.toString());
        OutputStream out = Files.newOutputStream(textPath);
        System.out.println("OutputStream out: " + out );
        Reader in1 = Files.newBufferedReader(textPath,Charset.defaultCharset());
        System.out.println("Reader in: " + in1.toString() );
        Writer out1 = Files.newBufferedWriter(textPath,Charset.defaultCharset());
        System.out.println("Writer out: " + out1 );

        //创建
        Path path = Paths.get("D:\\test11\\pathDemo");
        Path path1 = Paths.get("D:\\test11\\test01.txt");
        Path path2 = Paths.get("D:\\test11\\pathDemo2");
        Path path4 = Paths.get("D:\\test11\\pathDemo4");
        Path path04 = Paths.get("D:\\test11\\pathDemo4\\test02.txt");
        //创建空文件
        Files.createDirectory(path);
        Files.createFile(path1);
        Files.createDirectory(path2);
        Files.createDirectory(path4);
        Files.createFile(path04);
        //写入内容到path1: test01.txt
        String content00 = "this is a test";
        Files.write(path1,content00.getBytes());
        InputStream in00 = new ByteArrayInputStream(content00.getBytes());
        //复制
        //copy D:\test11\test01.txt内容 到 D:\test11\pathDemo4\test02.txt
        Files.copy(in00, path04, StandardCopyOption.REPLACE_EXISTING);

        //移动 D:\test11\test01.txt 到 D:\test11\pathDemo2
        //移走了path就不存在了
        Files.move(path, path2,StandardCopyOption.REPLACE_EXISTING);
        //判断
        if (exists(path04)){
            System.out.println("path exist: " + path04);
        }else {
            System.out.println("path not exist: " + path04);
        }
        if (isHidden(path04)){
            System.out.println("path04 is hidden");
        }else {
            System.out.println("path04 isn't hidden");
        }
        if (isReadable(path04)){
            System.out.println("path04 is readdable");
        }else {
            System.out.println("path04 is unreaddable");
        }
        if (isWritable(path)){
            System.out.println("path04 isWritable");
        }else {
            System.out.println("path04 can not Write");
        }
        if (isExecutable(path)){
            System.out.println("path04 isExecutable");
        }else {
            System.out.println("path04 can not execute");
        }
        //删除
//        delete(path);
        delete(path1);
        delete(path2);
        delete(path04);
        delete(path4);


    }




    private static Path concat(Path a, Path b) {
        if (!b.isAbsolute ()){
            a.resolve(b);
            return a.resolve(b);
        }else {
            System.out.println("b is absolute path,can not concat");
            return null;
        }

    }
}
