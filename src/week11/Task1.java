package week11;

public class Task1 {
    public static <S extends Comparable> void sapxep(S[] n){
        int m =n.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<m-1;j++){
                if(n[j].compareTo(n[j+1])>0){
                    S s= n[j];
                    n[j]=n[j+1];
                    n[j+1]=s;
                }
            }
        }
    }
    public static <S extends Comparable> void in(S[] n){
        int m =n.length;
        for(int i=0;i<m;i++){
            System.out.println("Sap xep nhu sau: ");
            System.out.println(n[i]);
        }
        System.out.println("\n\n");
    }

public static void main(String[] args){
    Character[] data1= {'w','s','a','i','h'};
    Integer[] data2= {3,2,647,444,33};
    Float[] data3={1.1F,44F,63.2F,3.5F};
    Byte[] data4={-4,44,2,-6};
    Short[] data5={235,111,3433,99};
    Long[] data6={44L,22L,32L};
    Double[] data7={23.3,32.1,53.5,55.2};
    sapxep(data1);
    in(data1);
    sapxep(data2);
    in(data2);
    sapxep(data3);
    in(data3);
    sapxep(data4);
    in(data4);
    sapxep(data5);
    in(data5);
    sapxep(data6);
    in(data6);
    sapxep(data7);
    in(data7);
//    sapxep(data1);
//    in(data1);

}
}