import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    private static final int WIDTH_WALL = 28;
    private static final int HEIGHT_WALL = 28;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();
        int widthWall = wall.getImage().getWidth();

        for(int x = 50; x < 550; x+= WIDTH_WALL)
        {
            wall = new Wall();
            addObject(wall,x,30);
        }

        for(int y = 30; y < 370; y+= HEIGHT_WALL)
        {
            wall = new Wall();
            addObject(wall,50,y);
        }

        for(int y = 30; y < 370; y+= HEIGHT_WALL)
        {
            wall = new Wall();
            addObject(wall,550,y);
        }

        for(int x = 50; x < 550; x+= WIDTH_WALL)
        {
            wall = new Wall();
            addObject(wall,x,366);
        }

        Banana banana = new Banana();
        addObject(banana,365,94);
        Cherry cherry = new Cherry();
        addObject(cherry,241,192);
        SmallBall smallBall = new SmallBall();
        addObject(smallBall,251,97);
        banana.setLocation(447,94);
        cherry.setLocation(106,278);
        smallBall.setLocation(463,259);
        BigBall ball = new BigBall();
        addObject(ball,300,121);
        Strawberry strawberry = new Strawberry();
        addObject(strawberry,291,277);
        SmallBall smallBall2 = new SmallBall();
        addObject(smallBall2,411,192);
        SmallBall smallBall3 = new SmallBall();
        addObject(smallBall3,179,200);
        BigBall ball2 = new BigBall();
        addObject(ball2,383,257);
        Banana banana2 = new Banana();
        addObject(banana2,347,82);
        Cherry cherry2 = new Cherry();
        addObject(cherry2,500,282);

        PacmanHud hud = new PacmanHud();
        addObject(hud,0,0);

        Pacman pacman = new Pacman(hud);

        addObject(pacman,110,90);
        smallBall3.setLocation(198,257);
        cherry.setLocation(187,153);
        banana2.setLocation(261,208);
        strawberry.setLocation(472,135);
        smallBall2.setLocation(330,236);
        smallBall.setLocation(284,91);
        banana.setLocation(393,156);
        cherry2.setLocation(414,305);
        Strawberry strawberry2 = new Strawberry();
        addObject(strawberry2,250,291);
        SmallBall smallBall4 = new SmallBall();
        addObject(smallBall4,110,317);
        Banana banana3 = new Banana();
        addObject(banana3,481,234);
        Cherry cherry3 = new Cherry();
        addObject(cherry3,413,84);
        smallBall.setLocation(331,129);
    }
}
