import java.util.Date;

public class Strong_Weak_DI {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date1:"+date);
    }
    public static void getDate(Date d){
        Date d2 = d;
        System.out.println("date2:"+d2);
    }
    
    public static void MemberUse1(){
        Member m1 = new Member();
    }
    public static void MemberUse2(Member m){
        Member m2 = m;
    }
}

class Member{
    String name;
    String nickName;
    public Member(){};
}
