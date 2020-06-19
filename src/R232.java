import java.util.Arrays;
import java.util.Scanner;

public class R232 {
    static int baudRate=1000;
    static int dataSize=8;
    static int check=1;
    static int stopSize=1;

    public static void main(String[] args) {
        System.out.println("请输入数据");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        int[] bits = new int[8];
        bits = intToBooleanArray(data);
        System.out.println("输出的数据为");

        //输出起始位
        System.out.print(0+"  ");

        int sum=0;
        for (int i=0;i<bits.length;i++) {
            System.out.print(bits[i]+"  ");
            sum+=bits[i];
            if (i % 4 == dataSize - 1) {
                System.out.print(1+"  ");
                stopSize--;
                sum+=1;
            }
        }
        //输出奇偶校验位
        if(check!=0){
            int x=2-sum%2;
            System.out.print(x+"  ");
        }

        for (int i = 0; i < stopSize; i++) {
            System.out.print(1+"  ");
        }
    }

    public static int[] intToBooleanArray(int data) {
        int[] result = new int[8];
        int i=0;

        while (data !=0)
        {
            result[i]=(data & 0x1);
            data = data >> 1;
            i++;
        }
        return result;
    }
}
