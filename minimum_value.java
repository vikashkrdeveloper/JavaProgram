public class minimum_value {
    public static void main(String[] args) {
        int []arr={78,9,89,67,89,44};
        int min =Integer.MAX_VALUE;
        for (int i:arr
             ) {
            if (min>i){
                min=i;
            }
        }
        System.out.println(min);
    }


}

