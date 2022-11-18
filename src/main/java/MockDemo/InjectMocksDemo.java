package MockDemo;

public class InjectMocksDemo {
    //
    private HttpService httpService;

    public String hello(String name){
        int status = httpService.queryStatus(name);
        if (status == 1) {
            return "hello";
        }else if( status == 2){
            return "yeah";
        }else {
            return "other";
        }
    }

}
