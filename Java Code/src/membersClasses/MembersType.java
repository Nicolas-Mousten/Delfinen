package membersClasses;

public class MembersType extends Member
{
    public MembersType(String name, int age, boolean hasPaid, boolean isPassive, boolean isPartOfStaff)
    {
        super(name, age, hasPaid, isPassive, isPartOfStaff);
    }

    /*
         membershipFeeAmount: Int
         -juniorMemberPrice: int
         -seniorMemberPrice: int
         -passiveMemberPrice: int
         -pensionerMemberPrice: int

    */


    private int juniorMemberPrice;
    private int seniorMemberPrice;
    private int passiveMemberPrice;
    private int pensionerMemberPrice;

    public void setMemberPriceFee()
    {
        this.juniorMemberPrice = juniorMemberPrice;
        this.seniorMemberPrice = seniorMemberPrice;
        this.passiveMemberPrice = passiveMemberPrice;
        this.pensionerMemberPrice = pensionerMemberPrice;
    }
}
