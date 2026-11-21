public class Demo {
    public static void main(String[] args) {
        int[] arr_num=new int[6];
        arr_num[0]=10;
        arr_num[1]=20;
        arr_num[2]=30;
        arr_num[3]=40;
        arr_num[4]=50;
        arr_num[5]=60;
        System.out.println("Size of Array is : "+arr_num.length);
        System.out.println(arr_num);

        System.out.println("----- for loop -----");
        for (int i=0;i<arr_num.length;i++){
            System.out.println(arr_num[i]);
        }
        System.out.println("----- for each loop -----");
        for(int i:arr_num){
            System.out.println(i);
        }
    }
}
