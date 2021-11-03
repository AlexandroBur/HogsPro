package game;


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

    //istaziamento di due LineUp

    public LineUp startingPlayerLineUp;
    public LineUp otherLineUp;

    //Constructor
    public Pointer(boolean P1starts){
        Player1Starts = P1starts;
        if (Player1Starts) {
            //def of list of coordinates
            startingPlayerLineUp = new LineUp(Co1,Co3,Co5,Co7,Co9);
            otherLineUp = new LineUp(Co2,Co4,Co6,Co8,Co10);
            //def of starting point
            currentPointLayoutX = Co1.getX();
            currentPointLayoutY = Co1.getY();
        } else {
            //sort array of points - def sequence of pointer
            startingPlayerLineUp = new LineUp(Co2,Co4,Co6,Co8,Co10);
            otherLineUp = new LineUp(Co1,Co3,Co5,Co7,Co9);
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
    //public int getCurrentPointInList() { return currentPointInList; }

    //Setter
    public void setNextPoint(Game currentGame){
        Coordinata nextCo;
        if(currentGame.getCurrentTurn() % 2 == 0){
            nextCo = otherLineUp.next();
        } else {
            nextCo = startingPlayerLineUp.next();
        }
        currentPointLayoutX = nextCo.x;
        currentPointLayoutY = nextCo.y;

    }

    public void pointerRemoveFromLineUp(int index, Boolean LeftLineUp){
        if(LeftLineUp){
            if(Player1Starts){
                startingPlayerLineUp.removeFromLineUp(index);
            } else {
                otherLineUp.removeFromLineUp(index);
            }
        } else {
            if (Player1Starts){
                otherLineUp.removeFromLineUp(index);
            } else {
                startingPlayerLineUp.removeFromLineUp(index);
            }
        }
    }
}
