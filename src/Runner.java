public class Runner {

    public static void main (String[] args) {
        ConnectFour C = new ConnectFour();
        String[][] f = C.createPattern();
        boolean loop = true;
        int count = 0;
        C.printPattern(f);
        while(loop) {
            if (count % 2 == 0) C.dropRedPattern(f);
            else C.dropYellowPattern(f);
            count++;
            C.printPattern(f);
            if (C.checkWinner(f) != null) {
                if (C.checkWinner(f) == "R")
                    System.out.println("The red player won.");
                else if (C.checkWinner(f)== "Y")
                    System.out.println("The yellow player won.");
                loop = false;

            }

        }

    }
}
