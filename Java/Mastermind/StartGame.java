import java.util.ArrayList;
import java.util.List;

public class StartGame {

    //Variablen:
    //StringListen
    private List<String> initialList, soughtAfterList;
    //Integer
    private int count, listSize;


    public void gameStart(){

        //initialList mit Werten füllen, kopieren in
        initialList = new ArrayList<String>();
        initialList.add("Grün");
        initialList.add("Blau");
        initialList.add("Gelb");
        initialList.add("Rot");
        initialList.add("Schwarz");
        initialList.add("Weiß");
        initialList.add("Orange");
        initialList.add("Violett");

        createSoughtAfterList(initialList);
    }
    
    private void createSoughtAfterList(List<String>tempColorList){

        String[]tempColorListArray = new String[tempColorList.size()];
        soughtAfterList = new ArrayList<String>();
        count = getCount();
        System.out.println(count);

        for (int i = 0; i < count; i++) {

            tempColorListArray = tempColorList.toArray(tempColorListArray);

            listSize = tempColorList.size();
            int random = (int)(Math.random()*listSize);

            soughtAfterList.add(tempColorListArray[random]);
            tempColorList.remove(tempColorListArray[random]);            
        }

        setSoughtAfterColors(soughtAfterList);

        for (String string : soughtAfterList) {
            System.out.print(string + " ");
        }

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