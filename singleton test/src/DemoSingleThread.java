public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println("DemoSingleThread");
        Singleton s1 = Singleton.getInstance("s1");
        Singleton s2 = Singleton.getInstance("s2");
        System.out.println(s1.value);
        System.out.println(s2.value);
    }
}
