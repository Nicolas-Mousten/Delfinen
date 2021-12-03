import UI.CashierUI;
import UI.LoginUI;
import membersClasses.Cashier;
import membersClasses.Chairman;
public class System {
    public static void main(String[] args) {
        int loginUser = LoginUI.startMenu();
        switch (loginUser) {
            case 1:

            case 2:
                CashierUI.cashierMenu();
            case 3:
                Chairman.chairmanMenu();
        }
    }
}
