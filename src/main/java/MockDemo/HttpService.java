package MockDemo;

import lombok.Data;

import java.util.Random;

@Data
public class HttpService {

    public void HttpService(){};

    public int queryStatus(String name){
        System.out.println("name : " + name);
        return new Random().nextInt(2);
    }
}
