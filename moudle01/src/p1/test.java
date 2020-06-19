package p1;


public class test {
    public static void main(String[] args) {
        try {
            int a = 0 / 3;
        } catch (NullPointerException ne) {
            System.out.println("运行时异常");
        } catch (Exception e) {
            System.out.println("异常");
        }
    }
}
