package creationalPattern.singleTone;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){};


    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance==null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    /*
        synchronized로 thread safe를 보장했다. 그러나 synchronized로 block 상태로 돌입하기 때문에
        전체적인 성능이 떨어질 수 있다.
     */

    public static ThreadSafeSingleton getInstanceDoubleCheck(){
        if(instance==null){
            synchronized (ThreadSafeSingleton.class){
                if(instance == null){
                    /*
                        메소드가 아니라 instance가 null일 경우에만 synchronized를 동작하도록 하는 코드
                     */
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

}
