import java.util.Scanner;

public class TurtleGraphics {
    Turtle turtle = new Turtle();
    static int[][] board = new int[20][20];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isDrawing = true;

        while (isDrawing) {
            String answer = input.nextLine();
            switch (answer) {
                case "1", "2", "3", "4":
                    parser(answer);
                    break;
            }
        }

    }


    public static String displayBoard() {
        String output = "";
        for (int[] row : board) {
            output += row;
            output += "\n";
        }
        return output;
    }


    public static void parser(String answer) {

    }
}
