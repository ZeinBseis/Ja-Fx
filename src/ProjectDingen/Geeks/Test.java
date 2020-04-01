package ProjectDingen.Geeks;

import java.util.Arrays;

public class Test {

    public static String cleaner(String toClean) {
        toClean = toClean.substring(toClean.indexOf("[") + 1,toClean.indexOf("]"));
        toClean = toClean.replace("\"","");
        toClean = toClean.replace(",","");
        return toClean;
    }

    public static String[] lister(String list) {
        return list.split(" ");
    }
    public static void main (String []args) {

        String players = "SVR PLAYERLIST [\"lo\", \"hi\"]";
        String game = "SVR GAMELIST ['Reversi, 'Tic-tac-toe']";

        String x = cleaner(players);

        String[] y =  lister(x);

        System.out.println(Arrays.toString(y));



    }

}
