public class Tester {
    static {
        System.out.println("类的静态初始化");
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        System.out.println(Tester.class.getName());
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        classLoader.loadClass("Tester");
        System.out.println("加载类");
        Class.forName("Tester");
    }
}
