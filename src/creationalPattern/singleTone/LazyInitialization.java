package creationalPattern.singleTone;

public class LazyInitialization {
    private  static LazyInitialization instance;

    private  LazyInitialization(){};

    public static LazyInitialization getInstance(){
        if(instance == null){
            instance = new LazyInitialization();
        }
        return instance;
    }
    /*
        getInstance를 부르는 시점에 객체를 생성한다. 그러나 multi-Thread일 때 동기화 문제가 발생한다.
        인스턴스가 없는 상태에서 여러 쓰레드가 getInstance()를 호출하면 결과를 예측하기 어려우며
        싱글톤 패턴에 위반된다.
     */
}
