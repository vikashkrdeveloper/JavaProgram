public class Avrage_of_the_marks {
    public static void main(String[] args) {
        int []arr={78,98,78,89,100};
        int sum=0;
        int avrage=0;
        for(int i:arr){
            sum+=i;
            avrage=sum/arr.length;
        }
        System.out.println(avrage);
    }
}
