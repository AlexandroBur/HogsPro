package game.models;

import java.util.ArrayList;
import java.util.List;

public class LineUp {
    public List<Pointer.Coordinata> coList =  new ArrayList<>(5);
    public int intCounter = 0;
    //constructor
    public LineUp(Pointer.Coordinata Co1,Pointer.Coordinata Co2,Pointer.Coordinata Co3,Pointer.Coordinata Co4,Pointer.Coordinata Co5){
        coList.add(0, Co1);
        coList.add(1 ,Co2);
        coList.add(2 ,Co3);
        coList.add(3, Co4);
        coList.add(4, Co5);
    }
    //metodi
    public Pointer.Coordinata next(){
        if(intCounter == 5){
            intCounter = 0;
        }
        while (!coList.get(intCounter).getIsUsable()){
            intCounter +=1;
            if(intCounter == 5){
                intCounter = 0;
            }
        }
        intCounter += 1;
        return coList.get(intCounter - 1);
    }

    public void removeFromLineUp(int index){
        coList.get(index).setIsUsable(false);
    }

    public Boolean chekIfEmpty() {
        if (
                coList.get(0).getIsUsable() == false &&
                coList.get(1).getIsUsable() == false &&
                coList.get(2).getIsUsable() == false &&
                coList.get(3).getIsUsable() == false &&
                coList.get(4).getIsUsable() == false
        ) {
            return true;
        } else {
            return false;
        }
    }
}
