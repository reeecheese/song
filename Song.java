import java.util.ArrayList;
public class Song {


    private String title; private String song; private int nee = 0; private String oldListener[] = new String[100];

    void Song(String t, String s){
        title = t; song = s;
    }

    public String getTitle(){return title;}
    public String getSong(){return song;}

    public int howMany(String[]list) {
        String temp = "";
        for (int i = 0; i < list.length; i++){
            temp = list[i].toLowerCase();
            for(int e = 0; i < oldListener.length; e++){
                if(!temp.equals(oldListener[e])){
                    oldListener[e] = temp;
                    nee++;
                }}}
        return nee;
    }

}
