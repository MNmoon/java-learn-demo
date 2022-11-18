package referenceType;

import javax.management.Descriptor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import static java.util.Arrays.sort;

public class Test {
    public static void main(String[] args) throws IOException {
//        //未设定值，int数组默认值0
//        int[] arrayRefVar = new int[5];
//        int[] testArray = new int[]{1,6,7,2,3};
//        arrayRefVar[0] = 1;
//        arrayRefVar[1] = 2;
//        //For-Each 循环或者加强型循环，它能在不使用下标的情况下遍历数组
//        for(int element: arrayRefVar)
//        {
//            System.out.println(element);
//        }
//        for(int elem: testArray){
//            System.out.println("elem " + elem);
//        }
//        //数组排序
//        sort(testArray);
//        for(int elem: testArray){
//            System.out.println("elem " + elem);
//        }
//        //初始化Date对象
//        Date date = new Date();
//        //get current timestamp
//        System.out.println(date.getTime());
//        //显示当前的日期
//        System.out.println(date.toString());
//        //格式化时间戳 2022-11-15 3 周二 319 17 CST 下午 05:42:12
//        //F:一个月中第几周 E 周几 D 一年中的第多少天 k: 一天中的小时 z 时区  a:AM/PM标记
//        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd F E D k z a hh:mm:ss");
//        System.out.println(ft.format(date));


//        long start = System.currentTimeMillis( );
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        long end = System.currentTimeMillis( );
//        long timeDiff = end - start;
//        System.out.println(timeDiff);


//        //Calendar类
//        //默认是当前日期
//        Calendar c1 = Calendar.getInstance();
//        //创建指定日期
//        c1.set(2009, 6 - 1, 12);
//        System.out.println("设定年月日:" + c1);
//        //只设定日期中某个字段
//        c1.set(Calendar.YEAR,2023);
//        System.out.println("设定YEAR 2023:" + c1);
//        c1.set(Calendar.MONTH,2);
//        System.out.println("设定MONTH 2:" + c1);
//        c1.set(Calendar.DAY_OF_MONTH,2);
//        c1.set(Calendar.DAY_OF_WEEK,2);
//        c1.set(Calendar.DAY_OF_YEAR,200);
//        System.out.println("设定MONTH 2:" + c1);
//        //日期计算
//        c1.add(Calendar.DATE, 10);//当前日期加10
//        c1.add(Calendar.DATE, -10);//当前日期减10
//        // 获得年份
//        int year = c1.get(Calendar.YEAR);
//        // 获得月份
//        int month = c1.get(Calendar.MONTH) + 1;
//        // 获得日期
//        int date = c1.get(Calendar.DATE);
//        // 获得小时
//        int hour = c1.get(Calendar.HOUR_OF_DAY);
//        // 获得分钟
//        int minute = c1.get(Calendar.MINUTE);
//        // 获得秒
//        int second = c1.get(Calendar.SECOND);
//        // 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
//        int day = c1.get(Calendar.DAY_OF_WEEK);
//
//        char c;
//        // 使用 System.in 创建 BufferedReader
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("输入字符, 按下 'q' 键退出。");
//        // 读取字符
//        do {
//            c = (char) br.read();
//            System.out.println(c);
//        } while (c != 'q');
//        //输入字符串  直到end
//        String str;
//        do {
//            str = br.readLine();
//            System.out.println(str);
//        } while (!str.equals("end"));
//        //输出到控制台
//        int b = 'A';
//        //write已被print println代替
//        System.out.write(b);
//        System.out.write('\n');

        //一个流被定义为一个数据序列。输入流用于从源读取数据，输出流用于向目标写数据


        //枚举
        Color myVar = Color.BLUE;

        switch(myVar) {
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
        }
        //打印枚举中所有值
        for(Color var: Color.values()){
            System.out.println(var);
        }
        //打印指定枚举值的索引
        System.out.println("index of Color.BLUE: " + Color.BLUE.ordinal());
        //返回指定枚举值的常量
        System.out.println("constant Color.BLUE: " + Color.valueOf("BLUE"));

    }


    public enum  Color {
        RED,
        GREEN,
        BLUE;
        // 构造函数
        private Color()
        {
            System.out.println("Constructor called for : " + this.toString());
        }

        public void colorInfo()
        {
            System.out.println("Universal Color");
        }
    }
}
