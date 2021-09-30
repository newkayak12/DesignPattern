package creationalPattern.singleTone;

public class StaticBlockInitialization {
    private static StaticBlockInitialization instance;

    private StaticBlockInitialization(){};

    static{
        try{
            instance=new StaticBlockInitialization();
        } catch (Exception e){
            throw new RuntimeException("Error");
        }
    }

    public static StaticBlockInitialization getInstance(){
        return instance;
    }

    /*
        Eager Initialization과 다르게 예외처리를 할 수 있다. 그러나 Eager Init과 마찬가지로 로딩 단계에서 인스턴스를 생성하기 때문에
        큰 리소스를 다루기 적합하지 않다.
     */
}
