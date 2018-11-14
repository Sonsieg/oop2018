package week10;
import java.util.Random;

public class Task2 {
    public static void bubbleSort(float a[]) {
        for (int i = 0; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                if (a[i] > a[j]) {
                    float x;
                    x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
    }
    public static void main(String[] args){
        float[] a= new float[1000];
        Random rd= new Random();
        for(int i=0;i<1000;i++){
            a[i]=rd.nextFloat();
        }
        Task2.bubbleSort(a);
        for(int i=0;i<1000;i++){
            System.out.println(a[i]);
        }
    }
}
