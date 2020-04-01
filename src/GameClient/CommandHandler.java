package GameClient;

public class CommandHandler {

    private String toCheck;
    private String toHandle;

    public CommandHandler() {

//        this.toCheck = toCheck;
//        this.toHandle = toHandle;
    }

    public String handle(String toHandle) {

        if (toHandle.startsWith("SVR HELP")) { return helper(toHandle);}
        else if (toHandle.startsWith("OK")) { return commandSucess();}
        else if (toHandle.startsWith("SVR PLAYERLIST")) { playerlist(toHandle); }
        else if (toHandle.startsWith("SVR GAMELIST")) {gamelist(toHandle);}
        else if (toHandle.startsWith("SVR GAME CHALLENGE")) {playerlist(toHandle);}
        else if (toCheck.contains("SVR GAME YOURTURN")) {yourTurn();}
        return "0";
    }

    private void yourTurn() {
    }

    private String commandSucess() {
        return "Command was successful";
    }

    private String[] playerlist(String toHandle) {
        toHandle = stringCleaner(toHandle);
        return toHandle.split(" ");
    }

    private String[] gamelist(String toHandle) {
        toHandle = stringCleaner(toHandle);
        return toHandle.split(" ");
    }


    private String helper(String toHandle) {
        return "To see Help please visit Blackboard and see Protocol.txt";
    }

    private String stringCleaner (String dirty) {
        dirty = dirty.substring(dirty.indexOf("[") + 1,dirty.indexOf("]"));
        dirty = dirty.replace("\"","");
        dirty = dirty.replace(",","");
        return dirty;
    }

}
