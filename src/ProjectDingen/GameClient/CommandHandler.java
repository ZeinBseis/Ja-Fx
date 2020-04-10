package ProjectDingen.GameClient;

public class CommandHandler {

    private String toCheck;
    private String toHandle;

    public CommandHandler() {

//        this.toCheck = toCheck;
//        this.toHandle = toHandle;
    }

    public static String handle(String toHandle) {

        if (toHandle.startsWith("SVR HELP")) { return helper(toHandle);}
        else if (toHandle.startsWith("OK")) { return commandSucess();}
        else if (toHandle.startsWith("SVR PLAYERLIST")) { return playerlist(toHandle); }
        else if (toHandle.startsWith("SVR GAMELIST")) { return gamelist(toHandle);}
        else if (toHandle.startsWith("SVR GAME CHALLENGE")) {return playerlist(toHandle);}
        else if (toHandle.contains("SVR GAME YOURTURN")) {yourTurn();}
        return "0";
    }

    private static void yourTurn() {
    }

    private static String commandSucess() {
        return "Command was successful";
    }

    private static String playerlist(String toHandle) {
        toHandle = stringCleaner(toHandle);
        return toHandle;
    }

    private static String gamelist(String toHandle) {
        toHandle = stringCleaner(toHandle);
        return toHandle;
    }


    private static String helper(String toHandle) {
        return "To see Help please visit Blackboard and see Protocol.txt";
    }

    private static String stringCleaner(String dirty) {
        dirty = dirty.substring(dirty.indexOf("[") + 1,dirty.indexOf("]"));
        dirty = dirty.replace("\"","");
        dirty = dirty.replace(",","");
        return dirty;
    }
    public static String[] toArray (String string) {
        String[] anArray = string.split(" ");
        return anArray;
    }


}
