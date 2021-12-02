import UI.LoginUI;
import membersClasses.Chairman;
public class System {                       //Nicolas
    public static void main(String[] args) {
        int loginUser = LoginUI.startMenu();
        switch (loginUser) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                Chairman.chairmanMenu();
                break;

        }
    }
}
