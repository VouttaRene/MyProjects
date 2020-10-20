package de.voutta.mastermind.StartGame;

import java.util.ArrayList;
import java.util.List;

public class CreateSoughtAfterList {

    int count, listSize;
    private List<String> soughtAfterList;

    public void allColorList(){

        //Liste mit allen Farben erstellen
        List<String> allColorList = new ArrayList<String>();
        allColorList.add("Grün");
        allColorList.add("Blau");
        allColorList.add("Gelb");
        allColorList.add("Rot");
        allColorList.add("Schwarz");
        allColorList.add("Weiß");
        allColorList.add("Orange");
        allColorList.add("Violett");

        createSoughtAfterList(allColorList);

    }

    private void createSoughtAfterList(List<String>tempColorList){

        String[]tempColorListArray = new String[tempColorList.size()];
        soughtAfterList = new ArrayList<String>();
        count = getCount();

        for (int i = 0; i < count; i++) {

            tempColorListArray = tempColorList.toArray(tempColorListArray);

            listSize = tempColorList.size();
            int random = (int)(Math.random()*listSize);

            soughtAfterList.add(tempColorListArray[random]);
            tempColorList.remove(tempColorListArray[random]);
        }

        setSoughtAfterColors(soughtAfterList);
    }

    public void setSoughtAfterColors(List<String>tempSoughtAfterList){
        soughtAfterList = tempSoughtAfterList;
    }

    public List<String> getSoughtAfterColors(){
        return soughtAfterList;
    }

    public void setCount(int tempCount){
        count = tempCount;
    }

    public int getCount(){
        return count;
    }
}
