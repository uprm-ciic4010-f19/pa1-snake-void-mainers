package Worlds;

import Game.Entities.Dynamic.Player;
import Game.Entities.Dynamic.Tail;
import Game.Entities.Static.Apple;
import Main.Handler;

import java.awt.*;
import java.util.LinkedList;


/**
 * Created by AlexVR on 7/2/2018.
 */
public abstract class WorldBase {

    private static final Font FONT_SMALL = null;

	//How many pixels are from left to right
    //How many pixels are from top to bottom
    //Must be equal
    public int GridWidthHeightPixelCount;

    //automatically calculated, depends on previous input.
    //The size of each box, the size of each box will be GridPixelsize x GridPixelsize.
    public int GridPixelsize;

    public Player player;

    protected Handler handler;


    public Boolean appleOnBoard;
    protected Apple apple;
    public Boolean[][] appleLocation;


    public Boolean[][] playerLocation;

    public LinkedList<Tail> body = new LinkedList<>();


    public WorldBase(Handler handler){
        this.handler = handler;

        appleOnBoard = false;


    }
    public void tick(){



    }

    public static double score=0; //initialized score
    //public static double scoreformula =  Math.sqrt(2* WorldBase.newscore + 1); /*Ended up not being used*/
    
    public void render(Graphics g){

        for (int i = 0; i <= 1200; i = i + GridPixelsize) {

            g.setColor(new Color (128, 0, 128));//made grid lines invisible
            g.drawLine(0, i, handler.getWidth() , i);
            g.drawLine(i,0,i,handler.getHeight());

        }

         g.setColor(Color.WHITE);
         g.setFont(FONT_SMALL);
         g.drawString("Score: " + score, 10, 20);
        
       

    }

}
