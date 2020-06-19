package p1;


import javafx.scene.layout.Priority;
import org.junit.jupiter.api.condition.DisabledOnOs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

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
