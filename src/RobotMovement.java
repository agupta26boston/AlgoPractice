public class RobotMovement {

    private int x;
    private int y;
    private int direction;

    //Constructor to intitialize the postion at 0,0 coordinates
    RobotMovement()
    {
        this(0, 0);
    }

    //Constructor to intitialize the postion with coordinates passed as parameter
    RobotMovement(int x, int y)
    {
        this.x = x;
        this.y = y;
        direction = 0;
    }

    public void turn_left()
    {
        direction -= 1;
        direction = (direction+4) % 4;// to make the direction not overflow
    }

    public void turn_right()
    {
        direction += 1;
        direction = (direction+4) % 4;
    }

    public void move_forward()
    {
        if (direction == 0)
        {
            y += 1;
        }
        if (direction == 1)
        {
            x += 1;
        }
        if (direction == 2)
        {
            y -= 1;
        }
        if (direction == 3)
        {
            x -= 1;
        }
    }

    public void command(char command_letter)
    {
        switch (command_letter)
        {
            case 'L': turn_left(); break;
            case 'R': turn_right(); break;
            case 'F': move_forward(); break;
            default: throw new IllegalArgumentException("Invalid command: " + command_letter);
        }
    }

    //Function to implement each command one by one
    public void instructions(String commands) {
        for (char command_letter : commands.toCharArray()) {
            command(command_letter);
        }
    }

    //Function to return the current position of the robot
    public String position()
    {
        System.out.println("[" +x+ "," +y+ "]");
        return x + ":" + y;
    }

    public static void main(String[] args)
    {
        RobotMovement robotMovement=new RobotMovement();
        robotMovement.instructions("LFFLFF");
        robotMovement.position();
    }
}
