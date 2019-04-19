public class KayakTestEx1Part2 {

    private int x;
    private int y;
    private int currentDirection;

    KayakTestEx1Part2(){
        this(0, 0);
    }

    KayakTestEx1Part2(int x, int y) {
        this.x = x;
        this.y = y;
        currentDirection = 0;
    }

//    public void move(String moves) {
//        for (char ch : moves.toCharArray()) {
//            if (ch == 'R') currentDirection += 1;
//            if (ch == 'L') currentDirection -= 1;
//
//            currentDirection = (currentDirection+4) % 4;
//
//            if (ch != 'F') continue;
//           // System.out.println(currentDirection);
//            if (currentDirection == 0) {
//                y += 1;
//            } if (currentDirection == 1) {
//                x += 1;
//            } if (currentDirection == 2) {
//                y -= 1;
//            } if (currentDirection == 3) {
//                x -= 1;
//            }
//        }
//    }

    public void turn_left(){
        currentDirection-=1;
        currentDirection = (currentDirection+4) % 4;
    }
    public void turn_right(){
        currentDirection+=1;
        currentDirection = (currentDirection+4) % 4;
    }
    public void move_forward(){
        if (currentDirection == 0) {
                y += 1;
            } if (currentDirection == 1) {
                x += 1;
            } if (currentDirection == 2) {
                y -= 1;
            } if (currentDirection == 3) {
                x -= 1;
           }
    }

    public void command(char command_letter)
    {
        switch (command_letter) {
            case 'L': turn_left(); break;
            case 'R': turn_right(); break;
            case 'F': move_forward(); break;
            default: throw new IllegalArgumentException("Invalid command: "+command_letter);
        }


    }
    public void instructions(String moves) {
        for (char command_letter : moves.toCharArray()) {
            command(command_letter);
        }
    }

    public void reset() {
        x = 0;
        y = 0;
        currentDirection = 0;
    }

    public String position() {
        System.out.println("[" +x+ "," +y+ "]");
        return x + ":" + y;
    }



    public static void main(String[] args) {

       // KayakTestEx1Part2 kayakTestEx1Part2=new KayakTestEx1Part2();
       // KayakTestEx1Part2.calculate("FFRFF");
        KayakTestEx1Part2 kayakTestEx1Part2=new KayakTestEx1Part2();
        kayakTestEx1Part2.instructions("LFFLFF");
        kayakTestEx1Part2.position();


    }

}
