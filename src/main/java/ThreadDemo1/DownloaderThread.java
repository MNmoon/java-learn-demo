package ThreadDemo1;

import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloaderThread extends Thread{
    private String name;
    private String url;

    public DownloaderThread(String name,String url){
        this.name = name;
        this.url = url;
    }



    @Override
    public void run(){
        //new 3 thereads to download pic
        WebDownloader wd = new WebDownloader();
        wd.downloader(url,name);
        System.out.println("下载文件名 " + name);
    }

    public static void main(String[] args) {
        DownloaderThread dt1 = new  DownloaderThread("https://img1.baidu.com/it/u=3009731526,373851691&fm=253&fmt=auto&app=138&f=JPEG?w=800&h=500","pic1");
        DownloaderThread dt2 = new  DownloaderThread("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Flmg.jj20.com%2Fup%2Fallimg%2F1114%2F041621122252%2F210416122252-1-1200.jpg&refer=http%3A%2F%2Flmg.jj20.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1669255320&t=84e95b5f4ee6ee8124f371194f485ed0","pic2");
        DownloaderThread dt3 = new  DownloaderThread("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Flmg.jj20.com%2Fup%2Fallimg%2F1114%2F010421142927%2F210104142927-13-1200.jpg&refer=http%3A%2F%2Flmg.jj20.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1669255336&t=4090c053214937ae614a75a0bf0a8cb0","pic3");

        dt1.start();
        dt2.start();
        dt3.start();
        System.out.println("下载完成！");

    }
}

class WebDownloader {

    //
    @SneakyThrows
    public void downloader(String url, String name) {
        //You need to encode your URL. Special character which have to be escaped.
        //java.net.MalformedURLException: no protocol: pic1
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("downloader 异常，IOException！");
        }
    }


}