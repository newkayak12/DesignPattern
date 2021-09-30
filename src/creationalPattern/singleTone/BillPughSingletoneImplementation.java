package creationalPattern.singleTone;

public class BillPughSingletoneImplementation {

    private BillPughSingletoneImplementation(){};
    private static class SingletoneHelper{
        private static final BillPughSingletoneImplementation INSTANCE = new BillPughSingletoneImplementation();
    }
    public static BillPughSingletoneImplementation getInstance(){
        return SingletoneHelper.INSTANCE;
    }
}
/*

    inner class로 싱글톤을 생성한다.
    SingletoneHelper클래스는 BillPughSingletoneImplementation 클래스가 로드된다고 해도 인스턴스를 만들지 않다가. getInstance()가 호출될 때 인스턴스를 생성한다.

 */