package game;

public class Pointer {
    //Definizione classe Coordinate
    public class Coordinata{
        private int x;
        private int y;
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
    }
    //definizioni paramenti del Pointer
    private int currentPointLayoutX;
    private int currentPointLayoutY;
    private int currentPointInList = 0;
    private boolean Player1Starts;

    //lista di possibili Coordinate del puntatore
    private Coordinata Co1 = new Coordinata(360,130);
    private Coordinata Co2 = new Coordinata(910,130);
    private Coordinata Co3 = new Coordinata(360,230);
    private Coordinata Co4 = new Coordinata(910,230);
    private Coordinata Co5 = new Coordinata(360,330);
    private Coordinata Co6 = new Coordinata(910,330);
    private Coordinata Co7 = new Coordinata(360,430);
    private Coordinata Co8 = new Coordinata(910,430);
    private Coordinata Co9 = new Coordinata(360,530);
    private Coordinata Co10 = new Coordinata(910,530);

    private Coordinata[] possiblePoints = new Coordinata[10];


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
        if(P1starts == false) {
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
    }

    //Getter
    public int getCurrentPointLayoutX(){
        return currentPointLayoutX;
    }
    public int getCurrentPointLayoutY(){
        return currentPointLayoutY;
    }

    //Setter
    public void setNextPoint(){
        currentPointInList += 1;
        if(currentPointInList>9){
            currentPointInList = 0;
        }
        currentPointLayoutX = possiblePoints[this.currentPointInList].getX();
        currentPointLayoutY = possiblePoints[this.currentPointInList].getY();
        //check if next point is available
        //switch to next set of points in the array
    }

}
