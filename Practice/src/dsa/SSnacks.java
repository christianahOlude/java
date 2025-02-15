public class SSnacks {
    public static void main(String[] args) {
        numbers();
    }
    public static void numbers() {
        int [] number = {4,5,8,8,8,2,9};

        for(int i=0;i<number.length;i++) {
            if(number[i] % 2 == 0) {
                System.out.print(0);
            }
            else {
                System.out.print(1);
            }
        }
    }
}
