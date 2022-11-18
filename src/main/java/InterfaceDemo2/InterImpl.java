package InterfaceDemo2;

public class InterImpl implements Inter1,Inter2 {
    /*
    * Inter1,Inter2中有重复的
    * */
    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");

    }

    @Override
    public void method4() {
        System.out.println("method4");

    }

    @Override
    public void method5() {
        System.out.println("method5");

    }

    @Override
    public void method6() {
        System.out.println("method6");

    }

    @Override
    public void method3() {
        System.out.println("method3");

    }
}
