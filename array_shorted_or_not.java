public class array_shorted_or_not {
    public static void main(String[] args) {
        int []arr={7,8,9,14,16,26,27};
        boolean isshort =true;
        for (int i=0; i<arr.length-1; i++){
            if (arr[i]>arr[i+1]) {
               isshort=false;
               break;
            }
        }
        if (isshort){
            System.out.println("your array is sorted");
        }
        else{
            System.out.println("your array is not sorted");
        }
    }

}
