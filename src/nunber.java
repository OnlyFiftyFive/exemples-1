public class nunber {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int h = number / 100;
        int t = (number - (h * 100)) / 10 ;
        int i = number - h*100 - t*10;

        return h + t + i;
    }
}
