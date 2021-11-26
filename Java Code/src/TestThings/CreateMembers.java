package TestThings;

import membersClasses.Member;

public class CreateMembers {
    public static void main(String[] args) {
        createMembers();
    }
    public static void createMembers(){
        Member nicolas = new Member("Nicolas",21,"nicolas.mousten@gmail.com",true);
        Member lasse = new Member("Lasse",23,"LasseTimm@outlook.com",false,false,true);
        Member tobias = new Member("Tobias",24, "TobiasDenBedste@Gmail.com",true);
        System.out.println(nicolas);
    }
}
