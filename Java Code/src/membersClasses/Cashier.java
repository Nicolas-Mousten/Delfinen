package membersClasses;

public class Cashier extends Trainer{
    public Cashier(String name, int age, String email, boolean hasPaid, boolean isPartOfStaff, boolean isPassive) {
        super(name, age, email, hasPaid, isPartOfStaff, isPassive);
    }

    public Cashier(String name, int age, boolean hasPaid, boolean isPassive, boolean isPartOfStaff) {
        super(name, age, hasPaid, isPassive, isPartOfStaff);
    }

    public void viewContigent(){

    }

    public void promptChairmanToRemoveMember(){


    }

}
