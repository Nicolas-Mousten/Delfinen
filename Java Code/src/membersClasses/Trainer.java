package membersClasses;

public class Trainer extends Member{
    public Trainer(String name, int age, String email, boolean hasPaid, boolean isPartOfStaff, boolean isPassive) {
        super(name, age, email, hasPaid, isPartOfStaff, isPassive);
    }

    public Trainer(String name, int age, boolean hasPaid, boolean isPassive, boolean isPartOfStaff) {
        super(name, age, hasPaid, isPassive, isPartOfStaff);
    }
}
