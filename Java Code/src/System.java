import UI.LoginUI;
import membersClasses.Chairman;
public class System {
    public static void main(String[] args) {
        int loginUser = LoginUI.startMenu();
        switch (loginUser) {
            case 1:

            case 2:

            case 3:
                Chairman.chairmanMenu();
        }
    }
}
