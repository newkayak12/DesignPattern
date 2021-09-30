package creationalPattern.singleTone;

public class EagerInitialization {
   private static final EagerInitialization instance = new EagerInitialization();

   private EagerInitialization(){}

    public static EagerInitialization getInstance(){
       return instance;
    }

    /*
        이 방법은 싱글톤 클래스가 다소 적은 리소스를 다룰 때 사용해야 한다.
        File System, Database Connection 등 큰 리소스를 다루는 싱글톤을 구현할 때에는 getInstance() 메소드가 호출될 때까지 싱글톤을 생성하지 않는 것이 좋다.
        Eager  Initializaion은 Exception에 대한 핸들링을 하지 않는다.
     */
}
