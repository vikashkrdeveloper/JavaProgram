public class array_reverse {
    public static void main(String[] args) {
        int []arr={341,34,233,231,23,21,2334};
        int length=arr.length;
        int []swap=new int[length];
        for (int i=0; i<length/2; i++) {
            swap[i]=arr[i];
            arr[i]=arr[length-i-1];
            arr[length-i-1]=swap[i];
        }

    for (int i=0; i<length; i++){
    System.out.println(arr[i]);
    }
    }
}
