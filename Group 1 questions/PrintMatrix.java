public class PrintMatrix {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int num = 1;
        
        int i = 0;
        do {
            int j = 0;
            do {
                System.out.print(num + "\t");
                num++;
                j++;
            } while (j < columns);
            System.out.println();
            i++;
        } while (i < rows);
    }
}
