package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pointer {
    //Definizione classe Coordinate
    public class Coordinata{
        private final int x;
        private final int y;
        private boolean isUsable = true;
        //constructor
        public Coordinata(int X, int Y){
            x = X;
            y = Y;
        }
        //getter
        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
        public boolean getIsUsable() { return isUsable; }

        //setter
        public void setIsUsable(boolean currentStatus ){
            isUsable = currentStatus;
        }
    }
    //definizioni paramenti del Pointer
    private int currentPointLayoutX;
    private int currentPointLayoutY;
    private int currentPointInList = 0;
    private boolean Player1Starts;

    //lista di possibili Coordinate del puntatore
    public final Coordinata Co1 = new Coordinata(360,130);
    public final Coordinata Co2 = new Coordinata(910,130);
    public final Coordinata Co3 = new Coordinata(360,230);
    public final Coordinata Co4 = new Coordinata(910,230);
    public final Coordinata Co5 = new Coordinata(360,330);
    public final Coordinata Co6 = new Coordinata(910,330);
    public final Coordinata Co7 = new Coordinata(360,430);
    public final Coordinata Co8 = new Coordinata(910,430);
    public final Coordinata Co9 = new Coordinata(360,530);
    public final Coordinata Co10 = new Coordinata(910,530);

    public Coordinata[] possiblePoints = new Coordinata[10];
    public List<Coordinata> leftList =  new ArrayList<>(5);
    public List<Coordinata> rightList = new ArrayList<>(5);


    //Constructor
    public Pointer(boolean P1starts){
        if (P1starts) {
            //def of sequence of pointer
            possiblePoints[0] = Co1;
            possiblePoints[1] = Co2;
            possiblePoints[2] = Co3;
            possiblePoints[3] = Co4;
            possiblePoints[4] = Co5;
            possiblePoints[5] = Co6;
            possiblePoints[6] = Co7;
            possiblePoints[7] = Co8;
            possiblePoints[8] = Co9;
            possiblePoints[9] = Co10;
            //def of starting point
            currentPointLayoutX = Co1.getX();
            currentPointLayoutY = Co1.getY();
        }
        if(!P1starts) {
            //sort array of points - def sequence of pointer
            possiblePoints[0] = Co2;
            possiblePoints[1] = Co1;
            possiblePoints[2] = Co4;
            possiblePoints[3] = Co3;
            possiblePoints[4] = Co6;
            possiblePoints[5] = Co5;
            possiblePoints[6] = Co8;
            possiblePoints[7] = Co7;
            possiblePoints[8] = Co10;
            possiblePoints[9] = Co9;
            //def of starting point
            currentPointLayoutX = Co2.getX();
            currentPointLayoutY = Co2.getY();
        }
        leftList.add(Co1);
        leftList.add(Co3);
        leftList.add(Co5);
        leftList.add(Co7);
        leftList.add(Co9);
        rightList.add(Co2);
        rightList.add(Co4);
        rightList.add(Co6);
        rightList.add(Co8);
        rightList.add(Co10);
    }

    //Getter
    public int getCurrentPointLayoutX(){
        return currentPointLayoutX;
    }
    public int getCurrentPointLayoutY(){
        return currentPointLayoutY;
    }
    public int getCurrentPointInList() { return currentPointInList; }

    //Setter
    public void setNextPoint(){
        currentPointInList += 1;
        if(currentPointInList>9){
            currentPointInList = 0;
        }
        if(!possiblePoints[this.currentPointInList].isUsable){
            currentPointInList += 1;
        }
        //check if next point is available
        currentPointLayoutX = possiblePoints[this.currentPointInList].getX();
        currentPointLayoutY = possiblePoints[this.currentPointInList].getY();

        //switch to next set of points in the array
    }

}
