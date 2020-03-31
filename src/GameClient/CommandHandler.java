package GameClient;

public class CommandHandler {

    private String toCheck;
    private String toHandle;

    public CommandHandler(String toHandle) {

//        this.toCheck = toCheck;
        this.toHandle = toHandle;
    }

    public String handle() {

        if (toHandle.contains("SVR HELP")) { return helper(toHandle);}
        else if (toHandle.equals("OK")) { return commandSucess();}
        else if (toCheck.equals("logout")) {  loggedOut();}
        else if (toCheck.equals("get gamelist")) {gamelist();}
        else if (toCheck.equals("get playerlist")) {playerlist();}
        else if (toCheck.contains("subscribe")) {}
        return "0";
    }

    private String commandSucess() {
        return "Command was successful";
    }

    private void playerlist() {
    }

    private void gamelist() {
    }

    private void loggedOut() {
    }

    private String loggedIn() {
        return "You are logged in";
    }

    private String helper(String toHandle) {
        return toHandle;
    }

    }
